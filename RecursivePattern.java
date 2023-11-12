package Java101;

import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int userInt;
        System.out.println("Enter a value: ");
        userInt = scf.nextInt();
        Pattern(userInt);
    }
    public static void Pattern(int userInt) {
        if (userInt <= 0) {
            System.out.print(userInt + " ");
        }
        else {
            System.out.print(userInt + " ");
            Pattern(userInt - 5);
            System.out.print(userInt + " ");
        }
    }
}




/* while (userInt > 0) {
            userInt -= 5;
            System.out.print(userInt + " ");
        } */