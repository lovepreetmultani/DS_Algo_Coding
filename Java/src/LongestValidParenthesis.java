package src;

import java.util.Stack;

public class LongestValidParenthesis {

    public static void main(String args[]){
        String str= "(()())";
        System.out.println("Length of balanced String is: "+longestValidParenthesis(str));
    }

    private static int longestValidParenthesis(String str) {
        if(str.length()<1){
            return 0;
        }
        int maxLength=0;
        Stack<Integer> stack = new Stack<>();
        for (int i =0;i<str.length();i++) {
            if(str.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

}
