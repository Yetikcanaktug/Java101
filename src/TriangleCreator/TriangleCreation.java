package TriangleCreator;
import java.util.Scanner;
public class TriangleCreation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("please insert a number : ");
        int n = inp.nextInt();

        for (int i = 0; i <= n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++){
                System.out.print("*");
            }
            System.out.println(" ");


        }
        for (int i = 0; i <= n-1; i++) {

            for (int j = 0; j < (1 * i+ 1); j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= (2 * (n-i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }
}
