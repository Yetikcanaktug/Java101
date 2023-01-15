package CalculatorNew;
import java.util.Scanner;
public class CalculatorNew {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        boolean check = true;
        int sum = 0;
        int controller = 0;


        while (controller %2 != 1){
            System.out.println("Please insert a number : ");
            int number = inp.nextInt();
            controller = number;

        if (number % 4 == 0){
            sum = sum + number;
        }
        }
        System.out.println("Summary of the numbers : " + sum);
    }
}
