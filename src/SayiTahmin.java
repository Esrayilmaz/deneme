import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        int gizliSayi = 57;
        int tahmin;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Tahmin ettiğiniz sayıyı giriniz:");
            tahmin = scanner.nextInt();
            if (tahmin<gizliSayi){
                System.out.println("Çok küçük, tekrar dene!");
            }
            if (tahmin>gizliSayi){
                System.out.println("Çok büyük, tekrar dene!");
            }
        } while (tahmin != gizliSayi);
            System.out.println("Buldun");




    }
}
