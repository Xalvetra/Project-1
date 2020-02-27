package TugasPerulangan2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class HourGlassFaris {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);

        System.out.print("Masukan Baris Yang Anda Inginkan : ");
        int n = faris.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = n - i; k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
