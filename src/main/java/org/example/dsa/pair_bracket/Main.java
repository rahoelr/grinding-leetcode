package org.example.dsa.pair_bracket;

import java.util.Stack;

public class Main {
    public static void main(String[] args){
        isBalanced("([{}]))");
    }

    public static void isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()){
                    System.out.println("is not balanced");
                }

                var top = stack.pop();
                if (c == ')' && top != '('){
                    System.out.println("not balanced");
                }
                if (c == '}' && top != '{'){
                    System.out.println("not balanced");
                }

                if (c == ']' && top != '['){
                    System.out.println("not balanced");
                }
                
            }
        }

        if (stack.isEmpty()){
            System.out.println("balanced");
        } else {
            System.out.println("not balanced");
        }
    }
}
