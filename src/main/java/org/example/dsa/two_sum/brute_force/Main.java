package org.example.dsa.two_sum.brute_force;

public class Main {

    // Fungsi untuk mengecek apakah ada dua angka yang jumlahnya sama dengan target
    public static boolean hasTwoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Ketemu pasangan: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    return true; // langsung return true kalau ketemu
                }
            }
        }
        // kalau tidak ada pasangan yang cocok
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 8};
        int target = 9;

        boolean result = hasTwoSum(numbers, target);

        if (result) {
            System.out.println("Ada dua angka yang jumlahnya sama dengan target!");
        } else {
            System.out.println("Tidak ada dua angka yang jumlahnya sama dengan target.");
        }
    }
}
