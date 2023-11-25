package src.Interview_practice;

import java.util.*;

public class get_server_count_interval {

    public static List<Integer> getStaleServerCount(int n, List<List<Integer>> log_data, List<Integer> query, int x) {
        List<Integer> result = new ArrayList<>();

        for (int q : query) {
            int start = q - x;
            int end = q;

            Set<Integer> serversReceivedRequest = new HashSet<>();

            for (List<Integer> log : log_data) {
                int server_id = log.get(0);
                int time = log.get(1);
                if (time >= start && time <= end) {
                    serversReceivedRequest.add(server_id);
                }
            }

            result.add(n - serversReceivedRequest.size());
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 6;
        int x = 2;
        List<List<Integer>> log_data = Arrays.asList(
                Arrays.asList(3, 2),
                Arrays.asList(4, 3),
                Arrays.asList(2, 6),
                Arrays.asList(6, 3)
        );
        List<Integer> query = List.of(3,2,6);

        List<Integer> result = getStaleServerCount(n, log_data, query, x);
        System.out.println(result);
    }
}


