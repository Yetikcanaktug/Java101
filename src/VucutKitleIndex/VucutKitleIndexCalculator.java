package VucutKitleIndex;
import java.util.Scanner;
public class VucutKitleIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz.");
        double kilo = input.nextDouble();
        System.out.println("Boyunuzu giriniz.(metre cinsinde)");
        double boy = input.nextDouble();
        double vucutKitleIndex = kilo/(boy*boy);
        System.out.println("Vücut kitle indexiniz: " + vucutKitleIndex);

    }

}
