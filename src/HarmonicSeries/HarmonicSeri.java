package HarmonicSeries;
import java.util.Scanner;
public class HarmonicSeri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("N Sayısını giriniz : ");
        double n = inp.nextInt();
        double s = 0;
        while (n>0){
            s += (1/n);
            n--;
        }
        System.out.println(s);
    }
}
