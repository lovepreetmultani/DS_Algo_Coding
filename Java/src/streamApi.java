package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamApi {
    public static void main(String[] args) {
        var strings = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit","cherry", "date");
        var longestString = strings.stream().max(Comparator.comparingInt(String::length));
        System.out.println("longest string is:"+longestString);
        var list1 = Arrays.asList(1, 3, 5, 7, 9);
        var list2 = Arrays.asList(3, 4, 5, 6, 7);
        var mergedList = Stream.concat(list1.stream(),list2.stream()).sorted().distinct().collect(Collectors.toList());
        System.out.println("mergedList is:"+mergedList);
        var intersection = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println("intersection is:"+intersection);
        var kthSmallest = Arrays.stream(list1.toArray()).sorted().skip(2).findFirst().orElse(-1);
        System.out.println("3rd smallest is:"+kthSmallest);
        var frequency  = strings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println("frequency is:"+frequency);
        var fibonacciSeries = Stream.iterate(new long[]{0,1},fib ->new long[]{fib[1],fib[0]+fib[1]}).limit(10)
                .map(fib -> fib[0])
                .collect(Collectors.toList());
        System.out.println("fibonacciSeries is:"+fibonacciSeries);
    }
}
