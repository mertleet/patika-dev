package Java101;

import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double KDV_VALUE = 1.18;
        double USER_PRICE;
        System.out.println("Enter your value:  ");
        USER_PRICE = userInput.nextDouble();
        boolean check = (USER_PRICE >= 1000 && USER_PRICE >= 0);
        if (check) {
            double KDV_PRICE = KDV_VALUE * USER_PRICE;
            System.out.println("Price without KDV:" + " " + USER_PRICE);
            System.out.println("Price with KDV: " + " " + KDV_PRICE);
        }
        else {
            final double KDV_VALUE2 = 1.08;
            double KDV_PRICE2 = USER_PRICE * KDV_VALUE2;
            System.out.println("Price without KDV:" + " " + USER_PRICE);
            System.out.println("Price with KDV: " + " " + KDV_PRICE2);
        }
    }
}




// Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
//
//(Not : KDV tutarını 18% olarak alın)
//
//KDV'siz Fiyat = 10;
//
//KDV'li Fiyat = 11.8;
//
//KDV tutarı = 1.8;
//
//Ödev
//Eğer girilen tutar 0 ve 1000 TL arasında ise KDV o
//
// Oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

