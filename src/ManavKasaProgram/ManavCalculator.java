package ManavKasaProgram;
import java.util.Scanner;
public class ManavCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutPrice,elmaPrice,domatesPrice,muzPrice,patlicanPrice;
        armutPrice = 2.14;
        elmaPrice = 3.67;
        domatesPrice = 1.11;
        muzPrice = 0.95;
        patlicanPrice = 5.00;

        System.out.println("Kaç kilo armut aldınız?");
        double armutKg= input.nextInt();
        System.out.println("Kaç kilo elma aldınız?");
        double elmaKg= input.nextInt();
        System.out.println("Kaç kilo domates aldınız?");
        double domatesKg= input.nextInt();
        System.out.println("Kaç kilo muz aldınız?");
        double muzKg= input.nextInt();
        System.out.println("Kaç kilo patlıcan aldınız?");
        double patlicanKg= input.nextInt();

        double toplam = (patlicanKg*patlicanPrice) + (muzKg*muzPrice) + (elmaKg*elmaPrice) + (armutKg*armutPrice) + (domatesKg*domatesPrice);
        System.out.println("Ödemeniz gereken tutar : " + toplam + " TL");

    }
}
