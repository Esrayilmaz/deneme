import java.util.Scanner;

public class TekCiftKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        boolean ciftMi = (sayi % 2 == 0);

        if (ciftMi) {
            System.out.println("çift");
        } else {
            System.out.println("tek");
        }


    }
}
