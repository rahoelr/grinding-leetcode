package org.example.dsa.pair_candles;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Masukkan Input : "));
        String input = scanner.nextLine();


        System.out.println(isValid(input));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Jika bracket pembuka, masukkan ke stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Jika bracket penutup, cek apakah stack tidak kosong dan cocok
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // Tidak ada pembuka
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false; // Pasangan tidak cocok
                }
            }
        }

        // Jika stack kosong → semua bracket sudah ditutup dengan benar
        return stack.isEmpty();
    }
}
