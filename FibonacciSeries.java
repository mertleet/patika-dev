package Java101;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int f1=0, f2=1, f3=1, fmax;
        System.out.println("Enter your value: ");
        fmax = scf.nextInt();
        for (int i=f1; i<fmax; i++) {
            f1=f2;
            f2=f3;
            f3=f2+f1;
            System.out.print(f1 + ", ");
        }
    }
}


//f1 f2 f3 ... fmax ilk döngü
// 0  1  1 ...  n

// f1 f2 f3  ikinci döngü
// 1  2  3

// f1 f2 f3 üçüncü döngü
// 3  5  8

// f1=f2;
// f2=f3;
// f3=f2+f1;
