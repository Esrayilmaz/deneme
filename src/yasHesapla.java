import java.util.Scanner;

public class yasHesapla {
    public static void main(String[] args) {
        int tarih = 2026;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz:");
        int yil = scanner.nextInt();
        int yas = tarih - yil;
        System.out.println("Yaşınız" + " " + yas);

    }
}
