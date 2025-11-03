package org.example.dsa.stack;

import java.util.Stack;

public class Main {
    static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after pop: " + stack.size());
    }
}
