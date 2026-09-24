import java.util.Scanner;

public class AsalKontrol {
    public static void main(String[] args) {
        boolean asalMi =true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int sayi = scanner.nextInt();

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;

            }

        }
        if (asalMi) {
            System.out.println(sayi + " Asal Sayıdır.");
        } else {
            System.out.println(sayi + " Asal Sayı Değildir.");
        }

    }
}
