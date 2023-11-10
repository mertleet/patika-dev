import java.util.ArrayList;
import java.util.Scanner;

public class NotOrtalama2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matematik notunu girin: ");
        int matematikNotu = scanner.nextInt();
        System.out.println("Fizik notunu girin: ");
        int fizikNotu = scanner.nextInt();
        System.out.println("Türkçe notunu girin: ");
        int turkceNotu = scanner.nextInt();
        System.out.println("Kimya notunu girin: ");
        int kimyaNotu = scanner.nextInt();
        System.out.println("Müzik notunu girin: ");
        int muzikNotu = scanner.nextInt();
        int gecmeNotu = 55;
        ArrayList<Integer> notlar = new ArrayList<>();
        notlar.add(matematikNotu);
        notlar.add(fizikNotu);
        notlar.add(turkceNotu);
        notlar.add(kimyaNotu);
        notlar.add(muzikNotu);
        double ortalama = ortalamaHesapla(notlar, gecmeNotu);
        if (Double.isNaN(ortalama)) {
            System.out.println("Girilen notlar 0 ile 100 arasında değil. Lütfen geçerli notlar girin.");
        } else {
            System.out.println("Ortalama: " + ortalama);
        }
    }
    public static double ortalamaHesapla(ArrayList<Integer> notlar, int gecmeNotu) {
        int toplam = 0;
        int notSayisi = 0;

        for (int not : notlar) {
            if (0 <= not && not <= 100) {
                toplam += not;
                notSayisi++;
            }
        }

        if (notSayisi == 0) {
            return Double.NaN;
        }
        return (double) toplam / notSayisi;
    }
}