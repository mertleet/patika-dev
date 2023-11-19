package Arrays;

import java.util.Scanner;

public class ArrayRepeat {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int userArrayLength, arrElements;
        System.out.println("Enter the length of array:");
        userArrayLength = scf.nextInt();
        int[] arrayList = new int[userArrayLength];
        for (int i=0; i<arrayList.length; i++) {
            System.out.println(i + "th element of the array: ");
            arrElements = scf.nextInt();
            arrayList[i] = arrElements;
        }
        int[] checker = new int[arrayList.length];
        int counter = 0;
        for (int i=0; i<arrayList.length; i++) {
            for (int j=0; j<arrayList.length; j++) {
                if (i != j && arrayList[i] == arrayList[j]) {
                    if (arrayList[i] % 2 == 0) {
                        if (!doExist(checker, arrayList[i])) {
                            checker[counter++] = arrayList[i];
                        }
                        break;
                    }
                }
            }
        }
        System.out.print("{ ");
        for (int i : checker) {
            if (i != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("}");
    }
    static boolean doExist(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
