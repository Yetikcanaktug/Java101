package KdvHesaplama;
import java.util.Scanner;
public class KdvHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün fiyatını giriniz.");
        double a = input.nextInt();
        double kdvOran = 1.18;
        double kdvEkliTutar= a*kdvOran;
        System.out.println("Kdv ekli tutar :" + kdvEkliTutar);
        System.out.println("Kdv Tutarı : " + (kdvEkliTutar-a));

    }
}
