package Java101;

import java.util.Scanner;
import java.lang.*;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        System.out.println("Enter your height: ");
        double height = scf.nextDouble();
        System.out.println("Enter your weight: ");
        double weight = scf.nextDouble();
        BodyMassIndex(height, weight);
    }
    static void BodyMassIndex(double height, double weight) {
        double bmi = (weight / Math.pow(height, 2));
        System.out.println("Your BMI is: " + bmi);
    }
}
