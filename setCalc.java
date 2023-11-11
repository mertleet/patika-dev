package Java101;

import java.util.Scanner;

public class setCalc {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int totalSet, subSetR, differenceFact;
        System.out.println("Enter the total number of elements of your set: ");
        totalSet = scf.nextInt();
        System.out.println("Enter number of different subsets with r elements: ");
        subSetR = scf.nextInt();
        differenceFact = totalSet - subSetR;
        System.out.println("Your combination of C(N,r) is: " + " " + combination(totalSet, subSetR, differenceFact));
    }
    static int totalSetFactorial(int totalSet) {
        int factorialOfTotal = 1;
        for (int i=totalSet; i>=1; i--) {
            factorialOfTotal *= i;
        }
        return factorialOfTotal;
    }
    static int subSetRFactorial(int subSetR) {
        int factorialofSub = 1;
        for (int i=subSetR; i>=1; i--) {
            factorialofSub *= i;
        }
        return factorialofSub;
    }
    static int differenceFactorial(int differenceFact) {
        int factorialofdiff = 1;
        for (int i = differenceFact; i>=1; i--) {
            factorialofdiff *= i;
        }
        return factorialofdiff;
    }
    static int combination(int totalSet, int subSetR, int differenceFact) {
        int FINAL_RESULT = totalSetFactorial(totalSet) / (subSetRFactorial(subSetR) * differenceFactorial(differenceFact));
        return FINAL_RESULT;
    }
}





/* Ödev
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!) */