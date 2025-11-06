package org.example.dsa.list_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        ArrayList<Integer> mySeconList = new  ArrayList<>();
        myList.add("Rahul");
        myList.add("Bagus");
        myList.add("Lia");

        mySeconList.add(10);
        mySeconList.add(2);
        mySeconList.add(31);
        mySeconList.add(4);


        System.out.println("my list before sorting = " + myList);
        Collections.sort(myList);
        System.out.println("my list after sorting = " + myList);


        System.out.println("mySeconList before sorting = " + mySeconList);
        Collections.sort(mySeconList);
        System.out.println("mySeconList after sorting = " + mySeconList);


        Collections.sort(myList, java.util.Collections.reverseOrder());
        System.out.println("mySeconList after sorting = " + myList);


    }
}
