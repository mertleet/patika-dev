package Java101;

import java.util.Scanner;

public class AverageCalc {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int userInt;
        System.out.println("Enter a value: ");
        userInt = scf.nextInt();

        int result = isDivisibleByFourAndThree(userInt);
        int count = forCounter(userInt);

        System.out.println("Average is: " + averageCalculator(result,count));

    }
    static int isDivisibleByFourAndThree(int userInt) {
        int result = 0;
        for (int i=1; i<userInt; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                result += i;
            }
        }
        return result;
    }
    static int forCounter(int userInt) {
        int count = 0;
        for (int j=1; j<userInt; j++) {
            if (j % 3 == 0 && j % 4 == 0) {
                count++;
            }
        }
        return count;
    }
    static double averageCalculator(int result, int count) {
        return (double) result / count;
    }
}
