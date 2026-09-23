
import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0-100 Arasındaki Notunuzu Giriniz: ");
        double not = scanner.nextDouble();
        if (not >= 90) {
            System.out.println("AA");
        } else if (not >= 80) {
            System.out.println("BA");
        } else if (not >= 70) {
            System.out.println("BB");
        } else if (not >= 60) {
            System.out.println("CC");
        } else {
            System.out.println("FF");
        }


    }
}
