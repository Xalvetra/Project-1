package PraktikumBFADC;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class FaktorialMain {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.print("Masukkan Jumlah Elemen Yang Ingin Anda Hitung = ");
        int elemen = faris.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.print("Masukkan Nilai Data Ke-" + (i + 1) + " : ");
            fk[i].nilai = faris.nextInt();
        }
        System.out.println("===================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        long start = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].FaktorialBF(fk[i].nilai));
        }
        long end = System.nanoTime();
        System.out.println("Waktu = " + (end - start)+" nanoseconds");
        System.out.println("===================================================");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        long start2 = System.nanoTime();
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].FaktorialDC(fk[i].nilai));
        }
        long end2 = System.nanoTime();
        System.out.println("Waktu = " + (end2 - start2)+" nanoseconds");
        System.out.println("===================================================");
    }
}
