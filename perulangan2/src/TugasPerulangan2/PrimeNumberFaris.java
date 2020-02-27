package TugasPerulangan2;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class PrimeNumberFaris {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);

        int bil, syarat;
        boolean c ;

        System.out.print("Masukan Posisi Bilangan N :");
        bil = faris.nextInt();

        syarat = 1;
        for (int a = 2; syarat <= bil; a++) {
            c = true;
            for (int b = 2; b < a; b++) {
                if (a % b == 0) {
                    c = false;
                }
            }
            if (c) {
                System.out.print(a + " ");
                syarat += 1;
            }
        }

    }

}
