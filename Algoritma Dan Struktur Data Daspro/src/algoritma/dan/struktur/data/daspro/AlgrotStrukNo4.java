package algoritma.dan.struktur.data.daspro;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class AlgrotStrukNo4 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        double uang, bunga,pembulatan,total = 0;
        int angkaBlkgKoma = 2;
        System.out.print("Masukkan Jumlah Tabungan Anda Pertama = Rp.");
        uang = faris.nextInt();
        System.out.print("Masukkan Jumlah Bulan Rencana Anda Menabung = ");
        int bulan = faris.nextInt();
        for (int i = 1; i <= bulan; i++) {
            bunga = uang * 0.02;
            uang = uang + bunga;
            pembulatan = Math.pow(10, angkaBlkgKoma);
            total = (double) Math.round(uang * pembulatan) / pembulatan;
        }
        System.out.println("Saldo Anda Setelah Bulan Ke-"+bulan+ ": Rp " +total);

    }
}
