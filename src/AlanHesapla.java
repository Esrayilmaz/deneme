import java.util.Scanner;

public class AlanHesapla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdörtgenin enini giriniz:");
        double en = scanner.nextDouble();
        System.out.println("Dikdörtgenin boyunu giriniz:");
        double boy = scanner.nextDouble();
        double alan = en * boy;
        System.out.println("Alan " + alan);

    }
}
