    package TugasAlgrotStruk;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasAlgrotStrukNo2 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        double uang, bunga, saldo,pembulatan,total = 0;
        int tahun, i = 0,angkaBlkgKoma = 2;
        System.out.print("Masukkan Saldo Tabungan Anda Pertama = Rp.");
        uang = faris.nextInt();
        System.out.print("Masukkan Saldo Rencana Tabungan Anda Terakhir = Rp.");
        saldo = faris.nextInt();
        while (uang <= saldo) {
            bunga = uang * 0.02;
            uang = uang + bunga;
            pembulatan = Math.pow(10, angkaBlkgKoma);
            total = (double) Math.round(uang * pembulatan) / pembulatan;
            i++;
        }
        System.out.println("Total Hasil Akhir : Rp." +total);
        System.out.println("Bulan Ke-"+i);
    }
}