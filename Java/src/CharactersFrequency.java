package src;

import java.util.HashMap;

public class CharactersFrequency {
    public static void main(String s[]) {
        String str = "hello java";
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if(ch!=' '){
                if(hm.containsKey(ch)){
                    hm.put(ch,hm.get(ch)+1);
                }else{
                    hm.put(ch,1);
                }
            }
        }

        for(int i =0;i<str.length();i++){
            if(str.charAt(i)!=' ' && hm.get(str.charAt(i))!=-1){
                System.out.println(str.charAt(i)+ "    "+hm.get(str.charAt(i)));
                hm.put(str.charAt(i),-1);
            }
        }
    }
}

