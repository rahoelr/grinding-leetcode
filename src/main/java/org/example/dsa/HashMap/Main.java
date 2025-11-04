package org.example.dsa.HashMap;

import java.util.HashMap;

public class Main {
    static void main(String[] args) {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("Jateng", "Semarang");
        myMap.put("Jatim", "Surabaya");
        myMap.put("Jabar", "Bandung");


        var value = myMap.get("Jateng");
        System.out.println(value);
        System.out.println(myMap);
    }
}
