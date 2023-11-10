package Java101;

import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        String userMonth;
        System.out.println("Month you were born: ");
        userMonth = scf.nextLine();
        String firstThree = userMonth.substring(0,3);
        String firstThreeCaps = firstThree.toUpperCase();
        if (firstThreeCaps.equals("JAN")) {
            int userDayJan;
            System.out.println("Which day?");
            userDayJan = scf.nextInt();
            if (userDayJan >= 1 && userDayJan <= 21) {
                System.out.println("Your sign is Capricorn.");
            }
            else {
                System.out.println("Your sign is Aquarius.");
            }
        }
          switch(firstThreeCaps) {
              case "FEB":
                  int userDayFeb;
                  System.out.println("Which day?");
                  userDayFeb = scf.nextInt();
                  if (userDayFeb >= 1 && userDayFeb <= 19) {
                      System.out.println("Your sign is Aquarius.");
                  }
                  else {
                      System.out.println("Your sign is Pisces.");
                  }
                  break;
              case "MAR":
                  int userDayMar;
                  System.out.println("Which day?");
                  userDayMar = scf.nextInt();
                  if (userDayMar >= 1 && userDayMar <= 20) {
                      System.out.println("Your sign is Pisces.");
                  }
                  else {
                      System.out.println("Your sign is Aries.");
                  }
                  break;
              case "APR":
                  int userDayApr;
                  System.out.println("Which day?");
                  userDayApr = scf.nextInt();
                  if (userDayApr >= 1 && userDayApr <= 20) {
                      System.out.println("Your sign is Aries.");
                  }
                  else {
                      System.out.println("Your sign is Taurus.");
                  }
                  break;
              case "MAY":
                  int userDayMay;
                  System.out.println("Which day?");
                  userDayMay = scf.nextInt();
                  if (userDayMay >= 1 && userDayMay <= 21) {
                      System.out.println("Your sign is Taurus.");
                  }
                  else {
                      System.out.println("Your sign is Gemini.");
                  }
                  break;
              case "JUN":
                  int userDayJun;
                  System.out.println("Which day?");
                  userDayJun = scf.nextInt();
                  if (userDayJun >= 1 && userDayJun <= 22) {
                      System.out.println("Your sign is Gemini.");
                  }
                  else {
                      System.out.println("Your sign is Cancer.");
                  }
                  break;
          }
    }
}



// Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov Dec

/* Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart */