package Java101;

import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scf = new Scanner(System.in);
        int mat, kimya, fizik, tarih, muzik, turkce;
        System.out.println("Matematik notu: ");
        mat = scf.nextInt();
        System.out.println("Kimya notu: ");
        kimya = scf.nextInt();
        System.out.println("Türkçe notu: ");
        turkce = scf.nextInt();
        System.out.println("Müzik notu: ");
        muzik = scf.nextInt();
        System.out.println("Fizik notu: ");
        fizik = scf.nextInt();
        System.out.println("Tarih notu: ");
        tarih = scf.nextInt();
        float ortalama = (kimya + fizik + tarih + turkce + mat + muzik) / 6;
        String check = (ortalama > 50) ? "Gectiniz" : "Kaldiniz";
        System.out.println("Not ortalaması: " + ortalama + " " + check);
    }

}
