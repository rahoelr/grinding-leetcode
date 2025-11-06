package org.example.dsa.sum_of_digits;

public class Main {
    public static void main(String[] args) {
        int digits = 1234;
        int sum = 0;

        // convert int to string
        String numString = String.valueOf(digits);

        for (char c : numString.toCharArray()) {
            if(Character.isDigit(c)){
                sum += Character.getNumericValue(c);
            }
        }

        System.out.println(sum);
    }
}
