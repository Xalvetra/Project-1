package PraktikumBFADC;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class SumArrayMain {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        double uang, bunga, saldo, pembulatan, total = 0;
        int angkaBlkgKoma = 2;

        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah Perusahaan = ");
        int PERUSAHAAN = faris.nextInt();
        for (int j = 0; j < PERUSAHAAN; j++) {
            System.out.println("PERUSAHAAN KE-"+(j+1));
            System.out.print("Masukkan Jumlah Bulan : ");
            int elm = faris.nextInt();

            SumArray sm = new SumArray(elm);
            System.out.println("============================================================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("masukkan Untung Bulan Ke -" + (i + 1) + " = ");
                sm.keuntungan[i] = faris.nextDouble();
            }
            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
//        pembulatan = Math.pow(10, angkaBlkgKoma);
//        total = (double) Math.round(sm.totalDC(sm.keuntungan, 0, sm.elemen - 1) * pembulatan) / pembulatan;
            System.out.printf("Total Keuntungan Perusahaan Selama " + sm.elemen + " bulan adalah = %.2f\n", sm.totalBF(sm.keuntungan));
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total Keuntungan Perusahaan Selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
            System.out.println("============================================================");
        }

    }
}
