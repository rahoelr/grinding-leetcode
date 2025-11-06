package org.example.dsa.find_min_value;

public class Main {
    static void main() {
        int[] numbers = {20,5,21,4,32,22,11,5,2,421};
        int minValue = numbers[0];

        for (int currentValue : numbers){
            if (minValue > currentValue){
                minValue = currentValue;
            }
        }
        System.out.println("minValue = " + minValue);
    }
}


//jika nilai lebih kecil dari data dari variable maka ganti data vairbael dengan current value