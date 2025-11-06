package org.example.dsa.vowels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static void main() {
        isVowels("rahul");
    }

    public static void isVowels(String text){
        List<String> vowels = new ArrayList<>(Arrays.asList("a", "e", "i", "o", "u"));
        int count = 0;

        String lowercase = text.toLowerCase();
        for ( char c : lowercase.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}
