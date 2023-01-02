package DaireAlanHesabi;
import java.util.Scanner;
public class DaireAlanHesapProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Dairenin Yarıçapını giriniz :");
        int r = input.nextInt();
        System.out.println("Merkez açısının ölçüsünü giriniz :" );
        int a = input.nextInt();
        double daireDilimAlan = (pi*(r*r)*a)/360;
        System.out.println("Daire dilimi alanı = " + daireDilimAlan + "birim kare");

    }
}
