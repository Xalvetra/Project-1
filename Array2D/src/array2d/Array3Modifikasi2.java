package array2d;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Array3Modifikasi2 {

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Baris Yang Anda Inginkan :");
        int Row = input.nextInt();
        System.out.print("Masukan Kolom Yang Anda Inginkan :");
        int Column = input.nextInt();

        int[][] nilai = new int[Row][Column];

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan nilai ke-[" + i + "][" + j + "] ");
                nilai[i][j] = input.nextInt();
            }
            System.out.println("------------------------");
        }
        for (int ArrayFaris[] : nilai) {
            for (int j : ArrayFaris) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
