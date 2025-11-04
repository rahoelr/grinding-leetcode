package org.example.dsa.switch_case;

public class Main {
    static void main() {

        String day = "Minggu";

        switch (day){
            case "Minggu":
                System.out.println("Ini adalah hari minggu");
                break;
            case "Senin":
                System.out.println("Ini adalah hari senin");
                break;
            default:
                System.out.println("Ini adalah hari selain minggu senin");
                break;
        }

    }
}
