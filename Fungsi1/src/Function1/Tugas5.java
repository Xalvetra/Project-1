package Function1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Tugas5 {

    static int[] nilai() {
        Scanner faris = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke - " + (i + 1) + " :");
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

    static int NilaiMaks(int[] a) {
        int nilaiMaks = 0;
        for (int i = 0; i > a.length; i++) {
            if(a[i]> nilaiMaks){
                nilaiMaks = a[i];
        }
    }
        return (nilaiMaks);
    }
    static int NilaiMin(int[] a) {
        int nilaiMin = 999999;
        for (int i = 0; i < a.length; i++) {
            if(a[i]< nilaiMin){
                nilaiMin = a[i];
        }
    }
        return (nilaiMin);
    }

public static void main(String [] Args){
        int [] n = nilai();
        System.out.println("========================================");
        System.out.println("Nilai Rata-Rata Mahasiswa : "+RataRata(n));
        System.out.println("Nilai Maksimum Mahasiswa : "+NilaiMaks(n));
        System.out.println("Nilai Minimum Mahasiswa : "+NilaiMin(n));
    }
}