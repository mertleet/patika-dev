package Java101;

import java.util.Scanner;

public class OddNumSum {
    public static void main(String[] args) {
       Scanner scf = new Scanner(System.in);
       int userInput;
       int result = 0;
       do {
           System.out.println("Enter a value: ");
           userInput = scf.nextInt();
           if (userInput % 4 == 0 && userInput % 2 == 0) {
               result += userInput;
           }
       }
       while (userInput % 2 == 0);
       System.out.println(result);
    }
}

