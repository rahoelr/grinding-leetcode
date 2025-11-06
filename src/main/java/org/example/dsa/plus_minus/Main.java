package org.example.dsa.plus_minus;

import java.util.List;

public class Main {
    static void main() {

    }

    public static void plusMinus(List<Integer> arr) {
        int positive_number = 0;
        int negative_number = 0;
        int zero_number = 0;

        for (Integer num : arr){
            if (num > 0 ){
                positive_number++;
            } else if (num < 0) {
                negative_number++;
            } else {
                zero_number++;
            }
        }

        double result_positive = (double) positive_number / arr.size();
        double result_negative = (double) negative_number / arr.size();
        double result_zero = (double) zero_number / arr.size();

        System.out.printf("%.6f\n", result_positive);
        System.out.printf("%.6f\n", result_negative);
        System.out.printf("%.6f\n", result_zero);
    }

}
