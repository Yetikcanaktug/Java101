package ActivityByWeather;
import java.util.Scanner;
public class Activities {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please input the weather temperature in °C :");
        int temperature = inp.nextInt();
        if (temperature < 5) {
            System.out.println("You can go to ski. On those weathers, this is best choice for you.");
        } else if (temperature >= 5 && temperature < 15) {
            System.out.println("You can go to the cinema. It's not too cold outside, but on those weathers inside is always better. ");
        } else if (temperature >= 15 && temperature < 25) {
            System.out.println("You can go on a picnic. Enjoy the beautiful weather!");
        } else if (temperature >= 25) {
            System.out.println("You should go swimming! The best solution to cool off in this weather.");
        } else
            System.out.println("There is a mistake.");


    }
}
