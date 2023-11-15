package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countFrequencyCharacters {

    public static void main(String s[]){
        String str="hello world";
        System.out.println("count and character:"+firstRepeatingCharacter(str));
    }

    private static String firstRepeatingCharacter(String str) {
        if(str.length()<1){
            return "No element";
        }

        str=str.replaceAll("[^a-z]","");
        HashMap<Character, Integer> repeatedChars= new HashMap<Character,Integer>();


        for(int i =0;i<str.length();i++){

            if(repeatedChars.containsKey(str.charAt(i))){
                repeatedChars.put(str.charAt(i), repeatedChars.get(str.charAt(i)+1));
            }else{
            repeatedChars.put(str.charAt(i),1);
            }
        }

        for(Map.Entry<Character, Integer> entry: repeatedChars.entrySet()){
            int count =entry.getValue();

            System.out.println("values are"+count+"   "+entry.getKey());
            if(count>1){
                System.out.println("element is:"+entry.getKey());
               // break;
            }
        }
        return "Not found";
    }
}
