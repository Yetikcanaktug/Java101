package StarDiamond;
import java.util.Scanner;
public class StarDiamondProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Please enter a number :");
        int seri = inp.nextInt();

        for (int i = 0; i <= seri; i++) {
            for (int j = 0; j < (seri - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = seri; i >= 0; i--) {
            for (int j = 0; j < (seri - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i+1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
