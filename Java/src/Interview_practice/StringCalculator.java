package src.Interview_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    private static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        Pattern pattern = Pattern.compile("//\\[(.*?)\\]\n(.*)");
        Matcher matcher = pattern.matcher(numbers);

        List<String> delimiters = new ArrayList<>();
        String inputNumbers = numbers;

        while (matcher.find()) {
            String delimiter = matcher.group(1);
            delimiters.add(Pattern.quote(delimiter));
            inputNumbers = matcher.group(2);
        }

        if (delimiters.isEmpty()) {
            delimiters.add(",");
            delimiters.add("\n");
        }

        String delimiterPattern = String.join("|", delimiters);

        String[] nums = inputNumbers.split(delimiterPattern);
        int sum=0;
        List<Integer> negativeNumbers = new ArrayList<>();
       for(String num :nums){
           int n = Integer.parseInt(num);
           if(n<0){
               negativeNumbers.add(n);
           }else if(n<=1000){
               sum+=n;
           }
       }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
        }
       return sum;
    }

    public static void main(String s[]){

        System.out.println(add(""));
        System.out.println(add("1"));
        System.out.println(add("1,2"));
        System.out.println(add("1\n2,3"));
        //System.out.println(add("1,2,-3,4,-5"));
        System.out.println(add("1001,2"));
        System.out.println(add("//[|||||||]\n1|||||||2|||||||3"));
        //System.out.println(add("//[|][%]\n1|2%3"));

    }
}
