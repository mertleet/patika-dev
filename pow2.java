package Java101;

import java.util.Scanner;

public class pow2 {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int base, expo;
        System.out.println("Enter the base: ");
        base = scf.nextInt();
        System.out.println("Enter the expo:");
        expo = scf.nextInt();
        System.out.println(base + " " + "over" + " " + expo + " " + "is: " + " " + getPow(base, expo));
    }
    static int getPow(int base, int expo) {
        int resultPower = 1;
        for (int i=1; i<=expo; i++) {
            resultPower *= base;
        }
        return resultPower;
    }
}

