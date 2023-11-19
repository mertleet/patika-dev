package Arrays;

import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int row, column, elements;
        System.out.println("Enter the row: ");
        row = scf.nextInt();
        System.out.println("Enter the column: ");
        column = scf.nextInt();
        int[][] matrix = new int[row][column];
        for (int i=0; i< matrix.length; i++) {
            System.out.println();
            for (int j=0; j<matrix[i].length; j++) {
                elements = scf.nextInt();
                matrix[i][j] = elements;
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println();
        System.out.println();

        for (int i=0; i < matrix[0].length; i++) {
            System.out.println();
            for (int j=0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + " ");
            }
        }
    }
}

