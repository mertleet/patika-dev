package Java101;

import java.util.Scanner;

public class RecursivePrime {
    public static void main(String[] args){
        Scanner scf = new Scanner(System.in);
        int userInt, max;
        System.out.println("Enter your value: ");
        userInt = scf.nextInt();
        max = userInt / 2;
        switch (prime(userInt, max)) {
            case 0 -> System.out.println(userInt + " " + "is not prime.");
            case 1 -> System.out.println(userInt + " " + "is a prime");
            default -> System.out.println("To be honest, I have no idea about how'd you end up here.");
        }
    }
    static int prime(int userInt, int max) {
        if (userInt < 2) {
            return 0;
        }
        else if (max == 1) {
            return 1;
        }
        else if (userInt % max == 0) {
            return 0;
        }

        return prime(userInt, --max);
    }
}




