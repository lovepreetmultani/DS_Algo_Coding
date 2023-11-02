package src;

import java.util.HashMap;

public class CountDuplicates {

    public static void main(String[] args) {
        String str  = "aabbcde";
        System.out.println("Final String and its count is: " + countDuplicates(str));
    }

    private static int countDuplicates(String str) {
        if(str.length()<0){
            return 0;
        }
        str = str.toLowerCase();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c: str.toCharArray()){
            if(Character.isLetter(c) || Character.isDigit(c)){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
        }

        int duplicateCount=0;
        for(int count: hm.values()){
            if(count>1){
                duplicateCount++;
            }
        }
        return duplicateCount;
    }

}
