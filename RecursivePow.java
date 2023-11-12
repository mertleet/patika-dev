package Java101;

import java.util.Scanner;

public class RecursivePow {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int n, m;
        System.out.println("Enter your base: ");
        n = scf.nextInt();
        System.out.println("Enter your exponential: ");
        m = scf.nextInt();
        System.out.println(Pow(n, m));
    }
    static int Pow(int n, int m) {
         if(m == 0) {
             return 1;
         }
        return (n*Pow(n, --m));
    }
}



