package org.example.dsa.while_loop;

public class Main {
    static void main(String[] args) {

// Outer loop
//        for (int i = 1; i <= 2; i++) {
//            System.out.println("Outer: " + i); // Executes 2 times
//
//            // Inner loop
//            for (int j = 1; j <= 3; j++) {
//                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
//            }
//        }
//
//    }

        String[] myCars = {"Jazz", "Avanza", "Civic" , "Ferio"};

        for (int i = 0; i < myCars.length; i++) {
            System.out.println(myCars[i]);
        }
    }
}
