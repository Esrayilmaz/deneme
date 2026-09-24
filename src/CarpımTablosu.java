import java.util.Scanner;

public class CarpımTablosu
{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int sayi= scanner.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(sayi+"*"+i+"="+(sayi*i));

        }
    }
}
