package Function1;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Tugas4 {

    static int[] nilai() {
        Scanner faris = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke - " + (i + 1) + " : ");
            array[i] = faris.nextInt();
        }
        return (array);
    }

    static double RataRata(int[] a) {
        double jumlah = 0, ratarata;
        for (int i = 0; i < a.length; i++) {
            jumlah += a[i];
        }
        ratarata = jumlah / a.length;

        return (ratarata);
    }

    public static void main(String[] Args) {

        System.out.println("Rata Rata Nilai Semua Mahasiswa Adalah : " + RataRata(nilai()));
    
    }
}