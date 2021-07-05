package com.gorkem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Product> storage = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean value = true;

        while(value) {

            System.out.println("Çıkmak için : q" + "\n" + "Devam etmek için : enter");
            String quit = scanner.nextLine();

            if (quit.equals("q")) {

                System.out.println("Çıkılıyor...");
                value = false;

            }else {

                System.out.print("Ürün adı giriniz : ");
                String productName = scanner.nextLine();

                System.out.print("Adet giriniz : ");
                int count = scanner.nextInt();
                scanner.nextLine();

                Product localProduct = isThere(productName);

                if (localProduct == null) {
                    Product newProduct = new Product(productName, count);

                    storage.add(newProduct);
                }else {
                    localProduct.setCount(localProduct.getCount() + count);
                }
            }
        }
        scanner.close();

        //for wants
        showProducts();

        showProductAndCount();

        typeSizeOfStorage();
    }

    public static Product isThere(String productName) {
        for (Product product : storage) {
            if(product.getName().equals(productName)) {
                return product;
            }
        }
        return null;
    }

    public static void showProducts() {
        int count = 0;

        for (Product product : storage) {
            count += product.getCount();
        }
        System.out.println("Toplam ürün sayısı : " + count);
    }

    public static void showProductAndCount() {
        for (Product product : storage) {
            System.out.println(product.getName() + " isimli üründen " + product.getCount() +" adet alınmıştır." );
        }
    }

    public static void typeSizeOfStorage() {
        System.out.println("Toplam çeşit : " + storage.size());
    }
}
