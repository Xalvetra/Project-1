package TugasPerulangan2;

import java.util.Scanner;

public class PineTreeFaris {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);

        System.out.print("Masukan Baris Yang Anda Inginkan : ");
        int n = faris.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = n; k >= j; k--) {
                    System.out.print(" ");
                }
                for (int l = 1; l <= j; l++) {
                    System.out.print("*");

                }

                for (int m = 1; m <= j; m++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}

