package src.Interview_practice;

import java.util.Stack;

public class ValidParenthesis {
    private static boolean isValid(String str) {
        if (str.length() < 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '{') {
                stack.push('}');
            } else if (ch == '[') {
                stack.push(']');
            } else if (ch == '(') {
                stack.push(')');
            }else if(stack.isEmpty() || stack.pop()!=ch){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String str= "[())";
        System.out.println("String is balanced: "+isValid(str));
    }
}
