package org.example.dsa.hashset;

import java.util.HashSet;

public class Main {
    static void main() {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("a"); // cause this value is duplicate so it would not assign to set variable

        System.out.println(set);
    }
}
