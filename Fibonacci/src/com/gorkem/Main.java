package com.gorkem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz : ");
        int uzunluk = scanner.nextInt();

        int sayi1 = 0, sayi2 = 1;

        int sayac = 0;

        while (sayac < uzunluk) {

            System.out.print(sayi1 + " ");

            int sayi3 = sayi2 + sayi1;
            sayi1 = sayi2;
            sayi2 = sayi3;

            sayac = sayac + 1;
        }
    }
}
