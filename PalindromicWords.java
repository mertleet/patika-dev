package Java101;

import java.util.Scanner;

public class PalindromicWords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.lang.String userInt, reversedString = "";
        System.out.println("Enter a string: ");
        userInt = scan.nextLine();
        for (int i=userInt.length()-1; i>=0; i--) {
            reversedString = reversedString + userInt.charAt(i);
        }
        if (reversedString.equalsIgnoreCase(userInt)) {
            System.out.println(userInt + " is a palindromic word. ");
        }
        else {
            System.out.println(userInt + " is not a palindromic word. ");
        }
    }
}
