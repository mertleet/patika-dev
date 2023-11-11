package Java101;

import java.util.Scanner;


class Pow {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int userInput;
        System.out.println("Enter your value: ");
        userInput = scf.nextInt();
        for (int i=1; i<userInput; i*=5) {
            System.out.println("5'in kuvvetleri: " + i + "\t");
        }
        for (int j=1; j<userInput; j*=4) {
            System.out.println("4'un kuvvetleri: " + j + "\t");
        }
    }
}