package Java101;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args){
        Scanner scf = new Scanner(System.in);
        System.out.println("Enter your value: ");
        int number = scf.nextInt();
        Polindrome(number);
    }
    static void Polindrome(int number) {
        int reversedNumber=0;
        int temp = number;
        int lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reversedNumber == number) {
            System.out.println(number + " " + "is a polindrome number.");
        }
        else {
            System.out.println(number + " " + "is not a polindrome number.");
        }
    }
}



// Bir sayının ilk basamağını bulmak
// 256 % 10 = 6 --> birler
// 256 / 10 = 25
// 25 % 10 = 5 --> onlar
// 25 / 10 = 2 --> yüzler