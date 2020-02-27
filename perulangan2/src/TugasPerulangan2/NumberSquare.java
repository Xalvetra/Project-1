package TugasPerulangan2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class NumberSquare {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int nomor;
        System.out.print("Masukkan Nomor : ");
        nomor = faris.nextInt();

        for (int i = 0; i < nomor; i++) {
            for (int j = 0; j < nomor; j++) {
                if (i == 0 || i == nomor - 1) {
                    System.out.print(nomor);

                } else if (j == 0 || j == nomor - 1) {
                    System.out.print(nomor);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
