package array1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Tugas3 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        Scanner haq = new Scanner(System.in);
        double total, akhir;
        System.out.println("=> Sistem Informasi Akademik <=");
        System.out.println();
        System.out.print("Masukkan Jumlah Mata Kuliah Yang Anda Ambil : ");
        int mk = faris.nextInt();
        int[] matkul = new int[mk];
        String[] napel = new String[mk];
        int[] sks = new int[mk];
        String[] nilai = new String[mk];
        double[] nilaiAsli = new double[mk];
        int jumlah = 0;
        int j = 0;
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukan Nama Mata Kuliah Ke-" + (i + 1) + " : ");
            napel[i] = haq.nextLine();
        }
        System.out.println();
        System.out.println("================================================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan bobot SKS " + napel[i] + " : ");
            sks[i] = faris.nextInt();
            System.out.print("Masukkan Nilai " + napel[i] + " (A,B+,B,C+,C,D) : ");
            nilai[i] = haq.next();
        }
        for (int i = 0; i < matkul.length; i++) {
            if (nilai[i].equalsIgnoreCase("A")) {
                nilaiAsli[i] = 4;

            } else if (nilai[i].equalsIgnoreCase("B+")) {
                nilaiAsli[i] = 3.5;

            } else if (nilai[i].equalsIgnoreCase("B")) {
                nilaiAsli[i] = 3.0;

            } else if (nilai[i].equalsIgnoreCase("C+")) {
                nilaiAsli[i] = 2.5;

            } else if (nilai[i].equalsIgnoreCase("C")) {
                nilaiAsli[i] = 2.0;

            } else if (nilai[i].equalsIgnoreCase("D")) {
                nilaiAsli[i] = 1.;

            } else {
                System.out.println("Anda Salah Memasukkan Abjad");
            }
        }
        for (int i = 0; i < matkul.length; i++) {
            j += sks[i];
            total = nilaiAsli[i] * sks[i];
            jumlah += total;
        }
        System.out.println();
        System.out.println("================================================");
        akhir = (double) jumlah / j;
        System.out.println("IP Semester Anda Adalah :" + akhir);

    }
}