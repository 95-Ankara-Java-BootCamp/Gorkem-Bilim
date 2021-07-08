package com.gorkem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean status = true;

        while (status) {

            System.out.println("quit : q");
            String word = scanner.nextLine();

            if (word.equals("q")) {
                System.out.println("Çıkılıyor...");
                status = false;
            } else {
                System.out.print("Vize notu : ");
                int visaGrade = scanner.nextInt();

                System.out.print("Final notu : ");
                int finalGrade = scanner.nextInt();
                //Dummy
                scanner.nextLine();

                int periodGrade = calculatePeriodGrade(visaGrade, finalGrade);
                String letterGrade = findLetterGrade(periodGrade);

                System.out.println("Dönem notu : " + periodGrade + "\n" +
                        "Harf Notu : " + letterGrade);
            }
        }
    }

    public static String findLetterGrade(int periodGrade) {
        if (periodGrade >= 0 && periodGrade <= 20) {
            return "FF";
        } else if (periodGrade > 20 && periodGrade <= 50) {
            return "CB";
        } else if (periodGrade > 50 && periodGrade <= 70) {
            return "BB";
        } else if (periodGrade > 70 && periodGrade <= 100) {
            return "AA";
        } else {
            return "Harf notu hesaplanamıyor!";
        }
    }

    public static int calculatePeriodGrade(int visaGrade, int finalGrade) {
        if (checkGrades(visaGrade, finalGrade)) {
            return (visaGrade * 4) / 10 + (finalGrade * 6) / 10;
        } else {
            return -1;
        }
    }

    public static boolean checkGrades(int visaGrade, int finalGrade) {
        return (visaGrade >= -1 && visaGrade <= 100) && (finalGrade >= -1 && finalGrade <= 100);
    }
}
