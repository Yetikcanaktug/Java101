package FactorielCalculator;
import java.util.Scanner;
public class Factoriel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please insert a number that you want to calculate factoriel of that number : ");
        int number = inp.nextInt();
        System.out.println("Please insert a number for calculation of combination : ");
        int combination = inp.nextInt();
        int calculation = 0;
        int n = 1;
        int r = 1;
        int p = 1;
        for(int i = number; i > 0; i--){
            n =n*i;
        }
        for (int j = combination; j > 0; j--){
            r =  r*j;

        }
        for (int z = number - combination; z > 0; z--){
            p = p* z;
        }
        calculation = n / ( r * p);
        System.out.println(calculation);

    }
}
