package KullaniciSifre;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Sifre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dosya adı
        String filename = "kullanicilar.txt";

        // Kullanıcıdan kullanıcı adı ve şifre alın
        System.out.print("Lütfen kullanıcı adınızı girin: ");
        String username = sc.nextLine();
        System.out.print("Lütfen şifrenizi girin: ");
        String password = sc.nextLine();

        // Dosyayı yazma modunda aç
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            // Kullanıcı adı ve şifreyi dosyaya yaz
            bw.write(username + "," + password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
