package org.example.dsa.anagram;

import java.util.Arrays;

public class Main {
    static void main() {
        String var_a = "rahul";
        String var_b = "luhar";

        isAnagram(var_a, var_b);
    }

    static void isAnagram(String a, String b) {
        if (a.length() != b.length()){
            System.out.println("this is not anagram");
        } else {
            char[] arrayA = a.toCharArray();
            char[] arrayB = b.toCharArray();

            Arrays.sort(arrayA);
            Arrays.sort(arrayB);

            String sortedA = new String(arrayA);
            String sortedB = new String(arrayB);

            if (sortedA.equals(sortedB)){
                System.out.println("anagram");
            } else {
                System.out.println("not anagram");
            }
        }

    }
}
