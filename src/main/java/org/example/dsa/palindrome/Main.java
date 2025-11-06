package org.example.dsa.palindrome;

public class Main {
    static void main() {
        String keyword = "level";
        String reverseKeyword = "";

        for (int i = keyword.length() - 1; i >= 0; i--){
            reverseKeyword = reverseKeyword + keyword.charAt(i);
        }

        if (keyword.equals(reverseKeyword)){
            System.out.println("this word is palindrome");
        } else {
            System.out.println("this word is not palindrome");
        }
    }
}
