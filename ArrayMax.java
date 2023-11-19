package Arrays;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Index of array: ");
        int arrayIndex = scanner.nextInt();
        int[] arrayList = new int[arrayIndex];

        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(i + "th element of the array: ");
            int arrElement = scanner.nextInt();
            arrayList[i] = arrElement;
        }

        System.out.println("Enter a value: ");
        int userInt = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arrayList.length; i++) {
            if (arrayList[i] < userInt && arrayList[i] > max) {
                min = arrayList[i];
            }
            if (arrayList[i] > userInt && arrayList[i] < min) {
                max = arrayList[i];
            }
        }

        System.out.println("The closest smaller number to " + userInt + " is: " + max);
        System.out.println("The closest larger number to " + userInt + " is: " + min);
    }
}


// 10 23 84 43 11
// 17
// 11 < 17 < 23
// min: 11
// max: 23