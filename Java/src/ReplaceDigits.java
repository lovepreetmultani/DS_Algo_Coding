package src;

public class ReplaceDigits {

    public static void main(String args[]){
        String str="a1b2c3d4e";
        System.out.println("Final String is: " + replaceDigits(str));
    }

    private static String replaceDigits(String str) {
        char[] charArray = str.toCharArray();
        for(int i =1;i<charArray.length;i=i+2){
            charArray[i] = (char) (charArray[i-1]+charArray[i]-'0');
        }
        return String.valueOf(charArray);
    }
}
