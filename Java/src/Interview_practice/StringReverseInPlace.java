package src.Interview_practice;

public class StringReverseInPlace {

    static String inPlaceReverse(String str) {
        StringBuilder strNew=new StringBuilder(str);
        int length = strNew.length();
        return strNew.reverse().toString();

    }

    public static void main(String s[]){
        String str = "hello world";
        System.out.println(" original String is: " + str);
        String r = inPlaceReverse(str);
        System.out.println(" reversed String is:  " + r);
    }
}
