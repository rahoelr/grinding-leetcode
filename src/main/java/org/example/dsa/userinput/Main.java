package org.example.dsa.userinput;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("pls input your name:");

        String name = myObj.nextLine();
        System.out.println(name);
    }
}
