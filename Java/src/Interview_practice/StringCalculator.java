package src.Interview_practice;

public class StringCalculator {

    private static int add(String number) {

        if (number.isEmpty()) {
            return 0;
        }

       String[] nums=number.split(",");
       int sum=0;
       for(String num :nums){
           sum+=Integer.parseInt(num);
       }
       return sum;
    }

    public static void main(String s[]){

        System.out.println(add(""));
        System.out.println(add("1"));
        System.out.println(add("1,2"));
    }


}
