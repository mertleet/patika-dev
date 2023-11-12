package Java101;

import java.util.Scanner;

public class ImprovedCalculator {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int userSelection;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        do {
            System.out.println(menu);
            userSelection = scf.nextInt();
            switch (userSelection) {
                case 1:
                    plus();
                break;

                case 2:
                    minus();
                break;

                case 3:
                    product();
                break;

                case 4:
                    division();
                break;

                case 5:
                    expo();
                break;

                case 6:
                    factorial();
                break;

                case 0:
                  break;

                default:
                    System.out.println("Invalid input. Please try again. ");

            }

        }
        while (userSelection != 0);
    }
    static void plus() {
        Scanner scf2 = new Scanner(System.in);
        int result  = 0;
        int number, i=1;
        while (true) {
            System.out.println(i++ + ". number: ");
            number = scf2.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result is: " + " " + result);
    }
    static void minus() {
        int result = 0;
        int number, i=1;
        while (true) {
            Scanner scf3 = new Scanner(System.in);
            System.out.println(i++ + ". number: ");
            number = scf3.nextInt();
            if (number == 0) {
                break;
            }
            result -= number;
        }
        System.out.println("Your result is: " + result);
    }
    static void product() {
        int result = 0;
        int number, i=1;
        while (true) {
            Scanner scf4 = new Scanner(System.in);
            System.out.println(i++ + ". number: ");
            number = scf4.nextInt();
            if (number == 0) {
                break;
            }
            result *= number;
        }
        System.out.println("Your result is: " + result);
    }
    static void division() {
        System.out.println("Under maintenance. ");
    }
    static void expo() {
        Scanner scf5 = new Scanner(System.in);
        int base, exp;
        System.out.println("Enter your base:");
        base = scf5.nextInt();
        System.out.println("Enter your exp: ");
        exp = scf5.nextInt();
        int result = 1;
        for (int i=1; i<=exp; i++) {
            result *= base;
        }
        System.out.println("Your result is: " + " " + result);
    }
    static void factorial() {
        Scanner scf6 = new Scanner(System.in);
        int number, result = 1;
        System.out.println("Enter your number: ");
        number = scf6.nextInt();
        for (int i=number; i>=1; i--) {
            result *= i;
        }
        System.out.println(number + "!" + " " + "is" + " " + result);
    }
    static void mod() {
    }
    static void rectangle() {
    }
}









/* 1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı */