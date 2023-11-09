package Java101;

import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gidilen Mesafe (KM): ");
        double mesafe = scanner.nextDouble();
        double taksimetreTutar = hesaplaTaksimetreTutari(mesafe);
        System.out.println("Taksimetre Tutarı: " + taksimetreTutar + " TL");
        scanner.close();
    }
    public static double hesaplaTaksimetreTutari(double mesafe) {
        double minTutar = 20.0;
        double acilisUcreti = 10.0;
        double birimFiyat = 2.20;
        double taksimetreTutar = acilisUcreti + (mesafe * birimFiyat);
        return Math.max(taksimetreTutar, minTutar);
    }
}
