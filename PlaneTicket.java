
/* KM fiyatı 0.10 Eur, 12 yaşından küçükse %50 indirim, 12 ve 24 arasındaysa %10 indirim, 65 yaşından büyükse %30
gidiş-dönüş alınırsa %20 indirim */

import java.util.Scanner;
import java.util.stream.StreamSupport;


public class PlaneTicket {

    public static void main(String[] args) {

        Scanner wayEnty = new Scanner(System.in);

        int ticketWayOneDir;

        System.out.println("Would you like your ticket one way or 2-way?");

        ticketWayOneDir = wayEnty.nextInt();

        switch(ticketWayOneDir) {

            case 1:

                int ageValue;

                double kmPrice = 0.10;

                double km;

                double totalOneWayPrice;

                Scanner ageEntry = new Scanner(System.in);

                System.out.println("Please enter your age: ");

                ageValue = ageEntry.nextInt();

                Scanner kmEntry = new Scanner(System.in);

                System.out.println("Please enter your destination: ");

                km = kmEntry.nextDouble();

                totalOneWayPrice = km * kmPrice;

                if(ageValue < 12) {

                    double discounted50 = totalOneWayPrice * 50/100;

                    System.out.println("Your estimated total is: " + discounted50);

                }

                else if (12 < ageValue && ageValue < 24){

                    double discounted10 = totalOneWayPrice * 90/100;

                    System.out.println("Your estimated total is: " + discounted10);

                }

                else if (ageValue > 65) {

                    double discounted30 = totalOneWayPrice * 70/100;

                    System.out.println("Your estimated total is: " + discounted30);

                }
                break;

            case 2:

                int ageValue2;

                double kmPrice2 = 0.10;

                double km2;

                double totalOneWayPrice2;

                Scanner ageEntry2 = new Scanner(System.in);

                System.out.println("Please enter your age: ");

                ageValue2 = ageEntry2.nextInt();

                Scanner kmEntry2 = new Scanner(System.in);

                System.out.println("Please enter your destination: ");

                km2 = kmEntry2.nextDouble();

                totalOneWayPrice2 = km2 * kmPrice2;

                if(ageValue2 < 12) {

                    double discounted5 = totalOneWayPrice2 * 50/100;

                    double discounted55 = discounted5 * 80/100;

                    System.out.println("Your estimated total is: " + discounted55);

                }

                else if (12 < ageValue2 && ageValue2 < 24){

                    double discounted1 = totalOneWayPrice2 * 90/100;

                    double discounted11 = discounted1 * 80/100;

                    System.out.println("Your estimated total is: " + discounted11);

                }

                else if (ageValue2 > 65) {

                    double discounted3 = totalOneWayPrice2 * 70/100;

                    double discounted33 = discounted3 * 80/100;

                    System.out.println("Your estimated total is: " + discounted33);

                }
                break;

            default:

                System.out.println("Whoops, something went wrong. Please try again.");

        }

    }

}
