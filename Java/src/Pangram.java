package src;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String s[]){
        String input = "The quick brown fox jumps over the dog";//"The quick brown fox jumps over the lazy dog";
        String inputHash = input.toLowerCase().replaceAll("[^a-z]","");
        Set<Character> presentElements = new HashSet<>();
        for(char ch:inputHash.toCharArray()){
            presentElements.add(ch);
        }
        if (isPangram(presentElements)) {
            System.out.println("The input is a pangram.");
        } else {
            String missingChars = getMissingCharacters(presentElements,input);
            System.out.println("The input is not a pangram. Missing characters: " + missingChars);
        }
    }
    private static String getMissingCharacters(Set<Character> input, String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            if(!input.contains(ch)){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    private static boolean isPangram(Set<Character> input) {

        return input.size()==26;
    }
}
