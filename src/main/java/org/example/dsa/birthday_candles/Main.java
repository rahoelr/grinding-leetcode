package org.example.dsa.birthday_candles;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    static void main() {

    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Hitung frekuensi setiap tinggi lilin
        for (int height : candles) {
            map.put(height, map.getOrDefault(height, 0) + 1);
        }

        // Cari tinggi maksimum
        int maxHeight = Collections.max(map.keySet());

        // Ambil jumlah lilin dengan tinggi maksimum
        return map.get(maxHeight);
    }

}
