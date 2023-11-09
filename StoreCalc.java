package Java101;

import java.util.Scanner;
import java.lang.*;

public class StoreCalc {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        final double PRICE_PEAR = 2.14;
        final double PRICE_APPLE = 3.67;
        final double PRICE_TOMATO = 1.11;
        final double PRICE_BANANA = 0.95;
        final double PRICE_EGGPLANT = 5.00;
        double PEAR_KG;
        double APPLE_KG;
        double TOMATO_KG;
        double BANANA_KG;
        double EGGPLANT_KG;
        System.out.println("Pears in KGs?: ");
        PEAR_KG = scf.nextDouble();
        double pear = PEAR_KG * PRICE_PEAR;
        System.out.println("Apples in KGs?: ");
        APPLE_KG = scf.nextDouble();
        double apple = APPLE_KG * PRICE_APPLE;
        System.out.println("Tomatos in KGs?: ");
        TOMATO_KG = scf.nextDouble();
        double tomato = TOMATO_KG * PRICE_TOMATO;
        System.out.println("Banana in KGs?: ");
        BANANA_KG = scf.nextDouble();
        double banana = BANANA_KG * PRICE_BANANA;
        System.out.println("Eggplant in KGs?: ");
        EGGPLANT_KG = scf.nextDouble();
        double eggplant = EGGPLANT_KG * PRICE_EGGPLANT;
        double toplam = (pear  + apple + tomato + banana + eggplant);
        System.out.println("Total sum: " + String.format("%.2f", toplam) + " TL");
    }
}
