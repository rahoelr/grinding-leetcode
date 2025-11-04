package org.example.dsa.array_list;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<>();

        System.out.println("Is ArrayList empty? " + myArrayList.isEmpty());

        myArrayList.add("Apple");
        myArrayList.add("Banana");
        myArrayList.add("Cherry");

        System.out.println("Element at index 1: " + myArrayList.get(1));
        System.out.println("ArrayList size: " + myArrayList.size());
        System.out.println("Is ArrayList empty? " + myArrayList.isEmpty());

        System.out.println("Removing element at index 0: " + myArrayList.remove(0));
        System.out.println("ArrayList size after removal: " + myArrayList.size());
        System.out.println("Is ArrayList contains 'Banana'? " + myArrayList.contains("Banana"));
        System.out.println("ArrayList: " + myArrayList);

    }
}
