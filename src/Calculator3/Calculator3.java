package Calculator3;
import java.util.Scanner;
public class Calculator3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please insert a number : ");
        int number = inp.nextInt();
        int i1 = 1;
        int i2 = 1;
        for (int i = 1; i<=number ; i++){
            i1 = i1*4;
            System.out.println("4's " + i + ". comma : " + i1);
            i2 = i2*5;
            System.out.println("5's " + i + ". comma : " + i2);
        }
        }
    }

