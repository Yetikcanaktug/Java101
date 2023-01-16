package ExponentialCalculator;
import java.util.Scanner;
public class ExpCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please insert a number : ");
        int n1 = inp.nextInt();
        System.out.println("Please insert a number that you want to calculate as exp. of the first number : ");
        int n2 = inp.nextInt();
        int number = 1;

        for (int i = 1; i <= n2; i ++){
            number = n1 * number;
        }
        System.out.println( "The answer is : " +  number);
    }
}
