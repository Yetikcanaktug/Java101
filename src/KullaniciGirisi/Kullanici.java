package KullaniciGirisi;
import java.util.Scanner;
public class Kullanici {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınız");
        userName = inp.nextLine();
        System.out.print("Şifreniz");
        password = inp.nextLine();

        if (userName.equals("Patika") && password.equals("Java123")) {
            System.out.println("Kullanıcı adınız ve şifreniz doğru.");
        } else {
            System.out.println("Yanlış kullanıcı adı veya şifre.");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz? (E/H)");
            String cevap = inp.nextLine(); // kullanıcıdan cevap alın

            if (cevap.equalsIgnoreCase("E")) { // eğer kullanıcı "E" veya "e" girdiyse
                System.out.println("Yeni şifrenizi girin:");
                String yeniSifre = inp.nextLine(); // kullanıcıdan yeni şifre alın

                System.out.println("Yeni şifrenizi tekrar girin:");
                String yeniSifreTekrar = inp.nextLine(); // kullanıcıdan yeni şifre tekrar alın

                if (yeniSifre.equals("Java123")) { // eğer iki yeni şifre aynıysa
                    System.out.println("Eski şifreniz ile aynı. Lütfen yeniden deneyin.");
                } else { // iki yeni şifre aynı değilse
                    System.out.println("Başarı ile oluşturuldu.");
                }
            } else { // kullanıcı "E" veya "e" girmediyse
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
            inp.close();
        }
    }
}
