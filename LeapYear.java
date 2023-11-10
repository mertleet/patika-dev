package Java101;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int userYear;
        System.out.println("Enter a year: ");
        userYear = scf.nextInt();
        yearCheck(userYear);
    }
    static void yearCheck(int userYear) {
        if (userYear % 400 == 0 || (userYear % 100 != 0 && userYear % 4 == 0)) {
           System.out.println(userYear + " " + "is a leap year");
        }
        else {
            System.out.println(userYear + " " + "is not a leap year.");
        }
    }
}
