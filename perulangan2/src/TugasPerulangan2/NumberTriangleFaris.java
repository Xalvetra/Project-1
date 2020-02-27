package TugasPerulangan2;

import java.util.Scanner;

public class NumberTriangleFaris {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int baris;
        System.out.print("Masukan Nilai Baris = ");
        baris = faris.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = baris; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println(" ");
        }
    }

}
