package org.example.dsa.anagram.anagram_hashmap;

import java.util.HashMap;

public class Main {
    static void main() {
        String a = "rahul";
        String b = "luhrr";

        isAnagram(a,b);
    }

    static void isAnagram(String a, String b) {
        if (a.length() != b.length()){
            System.out.println("The lengths are not equal, its not an anagram");
            return;
        } else {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char character : a.toCharArray()){
                if (map.containsKey(character)){
                    map.put(character, map.get(character) + 1);
                } else {
                    map.put(character, 1);
                }
            }

            // kurang dengan string b
            for (char character : b.toCharArray()){
                if (map.containsKey(character)){
                        map.put(character, map.get(character) - 1);

                    if (map.get(character) < 0 ){
                        System.out.println("not anagram");
                        return;
                    }
                } else {
                    System.out.println("not anagram");
                    return;
                }
            }
            for (int value : map.values()){
                if (value != 0){
                    System.out.println("not anagram");
                    return;
                }
            }

            System.out.println("anagram");
        }


    }
}
