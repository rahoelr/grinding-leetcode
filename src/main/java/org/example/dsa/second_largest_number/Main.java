package org.example.dsa.second_largest_number;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] numbers = {1,23,123,42,123,1234};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int secondLargest = numbers[numbers.length - 2];
        System.out.println(secondLargest);
    }


}
