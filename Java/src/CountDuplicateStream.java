package src;

import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;

public class CountDuplicateStream {

    public static void main(String[] args) {
        var str  = "jhjhjhjjhjhjh";
        System.out.println("Final String and the count is: " + countDuplicates(str));
    }
    private static int countDuplicates(String str) {
        str=str.toLowerCase();
        var hm=str.chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(identity(), counting()));
        return (int) hm.values().stream()
                .filter(count -> count > 1)
                .count();
    }
}

