package NumberSumCalculator;
import java.util.Scanner;
public class NSC {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println(" Please insert a number with max 4 digit. : ");
        int number = inp.nextInt();
        int numberCounter = 0;
        int total = 0;
        int calc = 0;
        int secondNumber = number;

        while (number != 0)
        {
            number /= 10;
            numberCounter++;
        }

        while (numberCounter>0){
            calc = secondNumber % 10;
            secondNumber = secondNumber / 10;
            numberCounter--;
            total = total + calc;

        }
        System.out.println(total + " Summary of the numbers.");
    }

}
