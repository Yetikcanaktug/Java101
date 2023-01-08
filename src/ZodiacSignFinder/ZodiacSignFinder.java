package ZodiacSignFinder;
import java.util.Scanner;
public class ZodiacSignFinder {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı giriniz.");
        int month = inp.nextInt();
        System.out.println("Lütfen doğduğunuz günü giriniz.");
        int day = inp.nextInt();

        if (month == 1) {
            if (day >= 1 && day < 22) {
                System.out.println("Oğlak burcu.");
            } else
                System.out.println("Kova Burcu.");

        }
        if (month == 2) {
            if (day >= 1 && day < 20) {
                System.out.println("Koca burcu.");
            } else
                System.out.println("Balık Burcu.");
        }
        if (month == 3) {
            if (day >= 1 && day < 21) {
                System.out.println("Balık burcu.");
            } else
                System.out.println("Koç Burcu.");
        }
        if (month == 4) {
            if (day >= 1 && day < 21) {
                System.out.println("Koç burcu.");
            } else
                System.out.println("Boğa Burcu.");
        }
        if (month == 5) {
            if (day >= 1 && day < 21) {
                System.out.println("Boğa burcu.");
            } else
                System.out.println("İkizler Burcu.");
        }
        if (month == 6) {
            if (day >= 1 && day < 22) {
                System.out.println("İkizler burcu.");
            } else
                System.out.println("Yengeç Burcu.");
        }
        if (month == 7) {
            if (day >= 1 && day < 23) {
                System.out.println("Yengeç burcu.");
            } else
                System.out.println("Aslan Burcu.");
        }
        if (month == 8) {
            if (day >= 1 && day < 24) {
                System.out.println("Aslan burcu.");
            } else
                System.out.println("Başak Burcu.");
        }
        if (month == 9) {
            if (day >= 1 && day < 24) {
                System.out.println("Başak burcu.");
            } else
                System.out.println("Terazi Burcu.");
        }
        if (month == 10) {
            if (day >= 1 && day < 24) {
                System.out.println("Terazi burcu.");
            } else
                System.out.println("Akrep Burcu.");
        }
        if (month == 11) {
            if (day >= 1 && day < 23) {
                System.out.println("Akrep burcu.");
            } else
                System.out.println("Yay Burcu.");
        }
        if (month == 12) {
            if (day >= 1 && day < 23) {
                System.out.println("Yay burcu.");
            } else
                System.out.println("Oğlak Burcu.");
        }

        }
    }


