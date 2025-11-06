package org.example.dsa.min_max_sum;

import java.util.List;

public class Main {
    static void main() {

    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        long sum = 0;

        for (int a : arr){
            sum += a;

            if (a < min){
                min = a;
            }
            if (a > max) {
                max = a;
            }
        }

        long sum_max = sum - min;
        long sum_min = sum - max;

        System.out.println(sum_min + " " + sum_max);
    }
}
