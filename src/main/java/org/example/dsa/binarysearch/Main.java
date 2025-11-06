package org.example.dsa.binarysearch;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;

        int result = binarySearch(numbers, target);

        if (result == -1) {
            System.out.println("Angka " + target + " tidak ditemukan");
        } else {
            System.out.println("Angka " + target + " ditemukan di index ke-" + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;                     // batas kiri
        int right = arr.length - 1;       // batas kanan

        while (left <= right) {
            int mid = (left + right) / 2; // cari titik tengah

            if (arr[mid] == target) {
                return mid;               // ditemukan
            }

            // jika target lebih besar, cari di sebelah kanan
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // jika lebih kecil, cari di sebelah kiri
                right = mid - 1;
            }
        }

        return -1; // jika tidak ditemukan
    }
}

