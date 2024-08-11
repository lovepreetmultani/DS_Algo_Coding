package src.Interview_practice;

public class runLengthEncoding {
    static String findFrequency(String str) {
        if(str.length() < 1 || str.isEmpty()){
            return "";
        }
        var count =1;
        var sb = new StringBuilder();
        for(var i =0;i<str.length()-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                sb.append(str.charAt(i));
                sb.append(count);
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(count);
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcc";
        String str1 = "aaa";
        System.out.println("frequency of string 1 is:"+findFrequency(str));
        System.out.println("frequency of string 2 is:"+findFrequency(str1));
    }
}
