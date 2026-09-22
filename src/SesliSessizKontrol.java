import java.util.Scanner;

public class SesliSessizKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Harf Alayım: ");
        char harf = scanner.next().charAt(0);
        boolean sesliMi = (harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u');
        if (sesliMi) {
            System.out.println("Sesli");
        } else {

            System.out.println("Sessiz");
        }

    }
}
