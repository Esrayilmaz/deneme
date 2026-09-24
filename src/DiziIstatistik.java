import java.util.Scanner;

public class DiziIstatistik {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sayilar = {10, 20, 4, 9, 75, 35, 68, 2};
        int max = sayilar[0];
        int min = sayilar[0];
        int toplam = 0;
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > max) {
                max = sayilar[i];
            }
            if (sayilar[i] < min) {
                min = sayilar[i];

            }

            toplam = toplam + sayilar[i];


        }
        double ortalama = (double) toplam/sayilar.length;
        System.out.println("En büyük: " + max);
        System.out.println("En küçük: " + min);
        System.out.println("Toplam: " + toplam);
    }
}
