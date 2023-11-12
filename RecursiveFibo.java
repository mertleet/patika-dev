package Java101;

import java.util.Scanner;

public class RecursiveFibo {
    static public void main (String[] args) {
        Scanner scf = new Scanner(System.in);
        int n;
        System.out.println("Enter your value: ");
        n = scf.nextInt();
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}



// Fibo algoritması
// f(1) = 0
// f(2) = 1
// f(3) = f(2) + f(1)
// f(4) = f(3) + f(2)
// f(5) = f(4) + f(3)
//          .
//          .
//          .
// f(n) = f(n-1) + f(n-2)