package Java101;

import java.lang.Math;
import java.util.Scanner;

public class TriangleCalc {
    public static void main(String[] args){
        Scanner userValue = new Scanner(System.in);
        System.out.println("Enter the 1st side of the triangle: ");
        double a = userValue.nextDouble();
        System.out.println("Enter the 2nd side of the triangle: ");
        double b = userValue.nextDouble();
        System.out.println("Enter the 3rd side of the triangle: ");
        double c = userValue.nextDouble();
        myTriangle(a,b,c);
    }
    public static void myTriangle(double a, double b, double c) {
        double perimeter = a + b + c;
        double halfPerimeter = (a+b+c)/2;
        double area = Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
        System.out.println("Perimeter of the triangle: " + perimeter + " " + "Area of the triangle: " + area);
    }
}
