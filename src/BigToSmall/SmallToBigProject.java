package BigToSmall;
import java.util.Scanner;

public class SmallToBigProject {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        System.out.println("İLk sayıyı giriniz.");
        int a = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int b = inp.nextInt();
        System.out.println("Üçüncü sayıyı giriniz.");
        int c = inp.nextInt();

        if(a<b && a<c) {
            if (b < c) {
                System.out.println("En küçük sayı : " + a + "  Ortanca sayı " + b + "  En büyük sayı : " + c);
            } else {
                System.out.println("En küçük sayı : " + a + "  Ortanca sayı " + c + " En büyük sayı : " + b);
            }
        }
        else if (b < a && b < c)
            if (a < c) {
                System.out.println("En küçük sayı : " + b + "  Ortanca sayı " + a + " En büyük sayı : " + c);
            } else {
                System.out.println("En küçük sayı : " + b + "  Ortanca sayı " + c + " En büyük sayı : " + a);
            }
        else if(c < a && c < b){
            if (b < a){
                System.out.println( "En küçük sayı : " + c + " Ortanca sayı " + b + "En büyük sayı : " + a);
            }
            else{
                System.out.println("En küçük sayı : " + c + " Ortanca sayı " + a + "En büyük sayı : " + b);
            }
        }






    }
}
