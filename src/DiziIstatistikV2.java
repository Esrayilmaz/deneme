public class DiziIstatistikV2 {
    static int maksimumBul(int[] dizi) {
        int max = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > max) {
                 max = dizi[i];
            }

        }
        return max;

    }
    static int minimumBul(int[] dizi){
        int min= dizi[0];
        for (int i = 1; i < dizi.length ; i++) {
            if (dizi[i]<min) {
                min = dizi[i];
            }

        }
        return min;
    }

    static int toplamBul (int[] dizi){
        int toplam=0;
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];

        }
        return  toplam;
    }
    static double ortalamaBul (int [] dizi){
      return (double) toplamBul(dizi)/ dizi.length;
    }

    static void main(String[] args) {
        int[] sayilar= {3,12,5,3,87,34,21,76};
        System.out.println("Maksimum Değer: "+ maksimumBul(sayilar));
        System.out.println("Minimum Değer: "+ minimumBul(sayilar));
        System.out.println("Toplam Değer: "+ toplamBul(sayilar));
        System.out.println("Ortalama Değer: "+ ortalamaBul(sayilar));

    }

}
