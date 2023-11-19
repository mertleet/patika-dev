package Arrays;

import java.util.*;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int arrayIndex, element;
        System.out.println("Length of the array: ");
        arrayIndex = scf.nextInt();
        int[] array = new int[arrayIndex];
        for (int i=0; i<array.length; i++) {
            System.out.println(i + "th element: ");
            element = scf.nextInt();
            array[i] = element;
        }
        Arrays.sort(array);
        System.out.print("In ascending order: " + Arrays.toString(array));
    }
}
