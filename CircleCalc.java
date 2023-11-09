package Java101;

import java.util.Scanner;
import java.lang.*;

public class CircleCalc {
    public static void main(String[] args) {
        Scanner userInputValue = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = userInputValue.nextDouble();
        myCircle(radius);
    }
    static void myCircle(double radius) {
        double area = Math.pow(radius, 2) * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Area of the circle is: " + area + " " + "Perimeter of the circle is: " + perimeter);
    }
}
