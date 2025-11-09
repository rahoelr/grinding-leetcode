package org.example.dsa.two_sum.hash_map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,8};
        int target = 11;

        twoSum(nums, target);

    }

    public static boolean twoSum(int[] array, int target){
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for(int i = 0; i < array.length; i++){
            int compliment = target - array[i];

            if(myMap.containsKey(compliment)){
                System.out.println("nilai : " + array[i] + "\nnilai 2 : " + compliment);
                System.out.println("index 1 : " + i + "\nindex 2 : " + myMap.get(compliment));
                return true;
            }

            myMap.put(array[i], i);
        }
        System.out.println("tidak ditemukan");
        return false;
    }
}
