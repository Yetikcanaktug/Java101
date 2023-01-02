package UcgenAlanHesabi;
import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlarını giriniz.");
        System.out.println("Birinci kenar.");
        int birinciKenar = input.nextInt();
        System.out.println("İkinci kenar.");
        int ikinciKenar = input.nextInt();
        System.out.println("Üçüncü kenar.");
        int ucuncuKenar = input.nextInt();
        int ucgenCevre = birinciKenar + ikinciKenar + ucuncuKenar;
        int u = (birinciKenar + ikinciKenar + ucuncuKenar) / 2;
        int alanKare = u* (u-birinciKenar) *(u-ikinciKenar) *(u-ucuncuKenar);
        double alan = Math.sqrt(alanKare);

        System.out.println("Üçgenin alanı = " + alan);
        System.out.println("Üçgenin Çevresi = " + ucgenCevre);



    }
}
