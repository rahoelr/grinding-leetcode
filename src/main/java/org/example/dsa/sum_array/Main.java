package org.example.dsa.sum_array;

public class Main {
    static void main() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9,111};
        int sum = 0;

        for (int values : numbers){
            sum = sum + values;
        }

        System.out.println("hasil akhir " + sum);
    }
}
