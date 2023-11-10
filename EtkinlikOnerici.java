package Java101;

import java.util.Scanner;

public class EtkinlikOnerici {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sıcaklık derecesini giriniz: ");
        double sicaklik = scanner.nextDouble();

        if (sicaklik < 5) {
            System.out.println("Koşullar: Kayak yapmayı öner.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Koşullar: Sinema etkinliğini öner.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Koşullar: Piknik etkinliğini öner.");
        } else {
            System.out.println("Koşullar: Yüzme etkinliğini öner.");
        }

        scanner.close();
    }
}

