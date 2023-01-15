package CalculatorThreeAndFour;
import javax.swing.*;
import java.util.Scanner;
public class CalculatorWithWhile {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please insert a number.");
        int number = inp.nextInt();
        int sayac = 0;
        int sum = 0;
        int check = 0;
        while (check != number) {
            check++;
            if (check % 3 == 0 || check % 4 == 0) {
                sum = sum + check;
                sayac++;
            }
        }
        sum = sum / sayac;
        System.out.println("3'e ve 4'e bölünen sayıların ortalaması : " + sum);
    }
}
