package src.Interview_practice;
import java.util.stream.IntStream;
class StringReverseStreamAPI {
    public static void main(String args[]) {
        IntStream.rangeClosed(2, 100)
                .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                        .allMatch(j -> i%j != 0))
                .forEach(n -> {
                    System.out.println(n);
                });
    }
}