import java.util.Scanner;

public class NumSorter {
    public static void main(String[] args){

        Scanner input1 = new Scanner(System.in);

        int value1, value2, value3;

        System.out.println("Enter the 1st value: ");

        value1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter the 2nd value: ");

        value2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);

        System.out.println("Enter the 3rd value: ");

        value3 = input3.nextInt();

        if (value1 > value2 && value1 > value3 && value2 > value3) {

            System.out.println("Numbers in ascending order: " + value3 + "\t" + value2 + "\t" + value1);

        }
        else if (value1 > value2 && value1 > value3 && value3 > value2) {

            System.out.println("Numbers in ascending order: " + value2 + "\t" + value3 + "\t" + value1);

        }
        else if (value2 > value1 && value1 > value3 && value2 > value3) {

            System.out.println("Numbers in ascending order: " + value3 + "\t" + value1 + "\t" + value2);

        }
        else if (value2 > value1 && value3 > value1 && value2 > value3) {

            System.out.println("Numbers in ascending order: " + value1 + "\t" + value3 + "\t" + value2);

        }
        else if (value3 > value1 && value2 > value1 && value3 > value2) {

            System.out.println("Numbers in ascending order: " + value1 + "\t" + value2 + "\t" + value3);

        }
        else if (value3 > value1 && value1 > value2 && value3 > value2) {

            System.out.println("Numbers in ascending order: " + value2 + "\t" + value1 + "\t" + value3);

        }
        else {

            System.out.println("Something went wrong, please try again.");

        }
    }
}