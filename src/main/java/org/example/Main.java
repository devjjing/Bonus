package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int zahl = 10;
        System.out.println(geradeZahl(zahl));
    }

    public static int geradeZahl(int zahl) {
        System.out.println(zahl);

        if (zahl % 2 == 0) {
            return zahl;
        } else {
            return zahl * 2;


        }

    }

}


