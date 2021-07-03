package com.gorkem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    String[] urunler = {"elma","armut","patates","salata","portakal","erik"};
	    Double[] fiyatlar = {3.12,4.40,6.23,2.54,7.77,23.32};

        System.out.print("Almak istediğiniz ürün : ");
        String item = scanner.nextLine();

        System.out.print("Kaç kilo : ");
        int agirlik = scanner.nextInt();

        if (item.equals(urunler[0])) {
            System.out.println(item + " için ödeyeceğiniz tutar : " + agirlik * fiyatlar[0]);
        }else if(item.equals(urunler[1])) {
            System.out.println(item + " için ödeyeceğiniz tutar : " + agirlik * fiyatlar[1]);
        }else if (item.equals(urunler[2])) {
            System.out.println(item + " için ödeyeceğiniz tutar : " + agirlik * fiyatlar[2]);
        }else if(item.equals(urunler[3])) {
            System.out.println(item + " için ödeyeceğiniz tutar : " + agirlik * fiyatlar[3]);
        }else if(item.equals(urunler[4])) {
            System.out.println(item + " için ödeyeceğiniz tutar : " + agirlik * fiyatlar[4]);
        }else if(item.equals(urunler[5])) {
            System.out.println(item + " için ödeyeceğiniz tutar : " + agirlik * fiyatlar[5]);
        }else {
            System.out.println("Elimizde istediğiniz ürün mevcut değil!");
        }
    }
}
