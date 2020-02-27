package algoritma.dan.struktur.data.daspro;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class AlgrotStrukNo7 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int k = 0, deret;
        System.out.print("Banyak Deret Fibonacci : ");
        deret = faris.nextInt();
        System.out.print("Hasil : ");
        for (int i = 0; i < deret; i++) {
            System.out.print(fiboNacci(k) + " ");
            k++;
        }
        System.out.println();

    }

    static int fiboNacci(int deret) {
        if (deret == 0 || deret == 1) {
            return deret;

        } else {
            return (fiboNacci(deret - 1) + fiboNacci(deret - 2));
        }
    }
}
