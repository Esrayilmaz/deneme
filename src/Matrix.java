public class Matrix {
    public static void main(String[] args) {

        char[][] tahta = {
                {'X', '-', 'O'},
                {'-', 'X', '-'},
                {'O', '-', 'X'}
        };

        for (int satir = 0; satir < tahta.length; satir++) {
            for (int sutun = 0; sutun < tahta[satir].length; sutun++) {
                System.out.print(tahta[satir][sutun] + " ");
            }
            System.out.println();

        }

    }
}