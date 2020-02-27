package TugasPerulangan2;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class OppositeNumberFaris {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka: ");
        angka = faris.nextInt();

        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {

                if (i % 2 == 1) {
                    System.out.print(j);
                }
            }

            for (int z = angka; z >= 1; z--) {

                if (i % 2 == 0) {
                    System.out.print(z);
                }
            }
            System.out.println();
        }

    }
}
