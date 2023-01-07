package SinifGecme;
import java.util.Scanner;

public class SinifGecmeHesaplayici {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        System.out.println("Matematik notunuzu giriniz.");
        mat = inp.nextInt();
        System.out.println("Fizik notunuzu giriniz.");
        fizik = inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz.");
        turkce = inp.nextInt();
        System.out.println("Kimya notunuzu giriniz.");
        kimya = inp.nextInt();
        System.out.println("Müzik notunuzu giriniz.");
        muzik = inp.nextInt();
        double average = (mat + fizik + turkce + kimya + muzik) / 5;
        if (mat>0 && turkce>0 && fizik>0 && kimya>0 && muzik>0  && mat <=100 && turkce <=100 && fizik <=100 && kimya <=100 && muzik <=100) {
            if (average <= 55) {
                System.out.println("Sınıfta Kaldınız.");
            } else
                System.out.println("Tebrikler! geçtiniz.");
        }
            else
            System.out.println("Yanlış değer girdiniz.");

            System.out.println("Ortalamanız: " + average);
    }
}








