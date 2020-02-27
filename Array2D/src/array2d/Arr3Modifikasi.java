package array2d;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Arr3Modifikasi {

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        int[][] nilai = new int[2][3];
        int i = 0;

        do {
            int j = 0;
            do {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                nilai[i][j] = input.nextInt();
                j++;

            } while (j < 3);
            System.out.println("------------------------");
            i++;
        } while (i < 2);
        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(nilai[i][j] + " ");
                j++;
            } while (j < 3);
            System.out.println();
            i++;
        } while (i < 2);

    }
}
