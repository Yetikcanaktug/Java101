package Taksimetre;
import java.util.Scanner;
public class TaksimetreHesap {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double perKm = 2.20;
       System.out.println("Kaç kilometre araç kullandığınızı giriniz.(Küsürat varsa lütfen virgül kullanın.)");
       double km = input.nextDouble();
       double acilis = 10;
       double odenecekTutar = ((perKm * km) + acilis);
       if (odenecekTutar<=20) {
           odenecekTutar = 20;
       }
        System.out.println("Ödenecek tutar = " + odenecekTutar);
    }
}
