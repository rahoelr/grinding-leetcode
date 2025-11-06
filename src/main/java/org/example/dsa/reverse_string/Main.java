package org.example.dsa.reverse_string;

public class Main {
    static void main() {
        String name = "Rahul";
        String reverseName = "";

        for (int i = name.length() - 1; i >= 0; i--){
            reverseName = reverseName + name.charAt(i);
        }

        System.out.println("reverseName = " + reverseName);
    }
}
