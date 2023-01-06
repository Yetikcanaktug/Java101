package CalculatorProject;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı giriniz");
        double n1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz.");
        double n2 = input.nextDouble();


        System.out.println("Toplama yapmak istiyorsanız 1, çarpma yapmak istiyorsanız 2, bölme yapmak istiyorsanız 3, çıkarma yapmak istiyorsanız 4 yazınız.");

        int calculation = input.nextInt();
        switch(calculation){
            case 1:
            System.out.println(n1 + n2);
            break;
            case 2:
                System.out.println(n1 * n2);
                break;
            case 3:
                System.out.println(n1 / n2);
                break;
            case 4:
                System.out.println(n1-n2);
                break;

        }

    }
}
