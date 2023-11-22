package Java101;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        Random random = new Random();
        int computerGuess = random.nextInt(100);

        Scanner scan = new Scanner(System.in);
        int userGuess;
        int attempts = 0;
        int[] wrongList = new int[5];
        boolean isWrong = false;
        boolean isWin = false;

        while (attempts < 5) {
            System.out.println("Enter your guess [0-100]: ");
            userGuess = scan.nextInt();
            if (userGuess < 0 || userGuess > 99) {
                if (isWrong) {
                    attempts++;
                    System.out.println("Mistake, Try again. Remaining attempts: " + (5-attempts));
                }
                else {
                    isWrong = true;
                    System.out.println("Stop entering values outside of the interval. ");
                }
                continue;
            }
            if (userGuess == computerGuess) {
                System.out.println("Congratulations, you won! Your guess is: " + userGuess);
                isWin = true;
                break;
            }
            else {
                System.out.println("Wrong guess. ");
                if (userGuess > computerGuess) {
                    System.out.println("Your guess is higher.");
                }
                else {
                    System.out.println("Your guess is lower.");
                }
                wrongList[attempts++] = userGuess;
                System.out.println("Remaining attempts: " + (5-attempts));
            }
        }
        if (!isWin) {
            System.out.println("You've lost! Number was: " + computerGuess);
            if (!isWrong) {
                System.out.println("Your attempts: " + Arrays.toString(wrongList));
            }
        }
    }
}
