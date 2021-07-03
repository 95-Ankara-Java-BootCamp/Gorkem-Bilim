package com.gorkem;

import java.util.Scanner;

public class Main {

    public static void calculatePoint(int point) {

        if (point >= 90) {
            System.out.println("Harf Notu Karşılığı : AA");
        }
        else if (point >= 85) {
            System.out.println("Harf Notu Karşılığı : BA");
        }
        else if (point >= 80) {
            System.out.println("Harf Notu Karşılığı : BB");
        }
        else if (point >= 75) {
            System.out.println("Harf Notu Karşılığı : CB");
        }
        else if (point >= 70) {
            System.out.println("Harf Notu Karşılığı : CC");
        }
        else if (point >= 65) {
            System.out.println("Harf Notu Karşılığı : DC");
        }
        else if (point >= 60) {
            System.out.println("Harf Notu Karşılığı : DD");
        }
        else if (point >= 55) {
            System.out.println("Harf Notu Karşılığı : FD");
        }
        else {
            System.out.println("Harf Notu Karşılığı : FF");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Harf notunu öğrenmek istediğiniz puanı giriniz : ");

        int point = scanner.nextInt();

        calculatePoint(point);
    }
}
