package org.example.dsa.find_missing_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // jumalah data nya yang asli


        // kurangi data yang asli dengan data yang ada, hasilnya da laha mising numbernya
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,4,5,6,8));
        List<String> list_string = List.of("a","b","c","d","e","f","g","h","i");

        findNumber(8, list);
    }

    public static void findNumber(int n, List<Integer> numbers){
        int sum = 0;
        int sum_numbers = 0;

        for (int i = 0; i <= n; i++){
            sum += i;
        }

        for (int a : numbers){
            sum_numbers += a;
        }

        int missingNumber = sum - sum_numbers;

        System.out.println(sum);
        System.out.println("missing number: " + missingNumber);
    }
}
