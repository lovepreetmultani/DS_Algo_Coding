import java.util.*;

public class UniversityTurnstile {

    public static List<Integer> getTimes(List<Integer> time, List<Integer> direction) {
        int n = time.size();
        List<Integer> result = new ArrayList<>(Collections.nCopies(n, -1));
        Queue<Integer> exitQueue = new LinkedList<>();
        Queue<Integer> enterQueue = new LinkedList<>();

        int lastUsed = -1; // -1: not used, 0: exit, 1: enter
        int currentTime = 0;
        int i = 0;

        while (i < n || !exitQueue.isEmpty() || !enterQueue.isEmpty()) {
            while (i < n && time.get(i) <= currentTime) {
                if (direction.get(i) == 0) {
                    exitQueue.offer(i);
                } else {
                    enterQueue.offer(i);
                }
                i++;
            }

            if (!exitQueue.isEmpty() && (lastUsed == 0 || lastUsed == -1 || enterQueue.isEmpty())) {
                int person = exitQueue.poll();
                result.set(person, currentTime);
                lastUsed = 0;
            } else if (!enterQueue.isEmpty()) {
                int person = enterQueue.poll();
                result.set(person, currentTime);
                lastUsed = 1;
            } else {
                // No one at the turnstile at this second
                lastUsed = -1;
            }

            currentTime++;
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> time = Arrays.asList(0, 0, 1, 5);
        List<Integer> direction = Arrays.asList(0, 1, 1, 0);

        List<Integer> result = getTimes(time, direction);
        System.out.println(result);
    }
}

