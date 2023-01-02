package NotOrtalamasi;
import java.util.Scanner;

public class NotOrtalamasiHesap {

    public static void main(String[] args){

    //Kullanıcının veri girebileceği bir sistem yaratalım:

    Scanner input = new Scanner(System.in);

    int fizik,matematik,kimya,biyoloji,muzik,bedenEgitimi,ingilizce;

    System.out.println("Fizik notunuzu giriniz");
    fizik = input.nextInt();

        System.out.println("Matematik notunuzu giriniz");
        matematik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz");
        kimya = input.nextInt();

        System.out.println("Biyoloji notunuzu giriniz");
        biyoloji = input.nextInt();

        System.out.println("Muzik notunuzu giriniz");
        muzik = input.nextInt();

        System.out.println("Beden eğitimi notunuzu giriniz");
        bedenEgitimi = input.nextInt();

        System.out.println("İngilizce notunuzu giriniz");
        ingilizce = input.nextInt();

        int notOrtalamasi = (fizik + bedenEgitimi + kimya + matematik + biyoloji + ingilizce + muzik) / 7;
        System.out.println("Not ortalamanız :" + notOrtalamasi);
        String sonuc = (notOrtalamasi > 60) ? "Geçti" : "Kaldı";
        System.out.println(sonuc);



    }


}
