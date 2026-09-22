import java.util.Scanner;

public class OperatorPratik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.println("Toplam= " + (sayi1 + sayi2));
        System.out.println("Çıkan= " + (sayi1 - sayi2));
        System.out.println("Çarpım= " + (sayi1 * sayi2));
        System.out.println("Bölüm= " + (sayi1 / sayi2));
        System.out.println("Mod= " + (sayi1 % sayi2));


    }
}


