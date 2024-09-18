package src.Interview_practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String s[]){
        var countries = new String[]
        {"IN" , "GB"};
        Stream<String> sorted =
                Arrays.stream(countries)
                        .filter (c->c. contains ("IN" ));
        sorted.forEach(System.out::println);
    }
}
