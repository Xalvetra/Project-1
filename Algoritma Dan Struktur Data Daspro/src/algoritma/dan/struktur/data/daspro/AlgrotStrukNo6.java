package algoritma.dan.struktur.data.daspro;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class AlgrotStrukNo6 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int Array[][] = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                Array[i][j] = faris.nextInt();
            }
        }
        int total = 0;
        System.out.println("------------------------");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                total += Array[i][j];
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("|"+Array[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("Total Seluruh Bilangan Anda Adalah " + total);
    }
}
