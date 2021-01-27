package PraktikumBFADC;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class PangkatMain {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.print("Masukkan Jumlah Elemen Yang Ingin Dihitung = ");
        int elemen = faris.nextInt();

        Pangkat[] png = new Pangkat[elemen];

        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan Nilai Yang Akan Dipangkatkan Ke-" + (i + 1) + " : ");
            png[i].nilai = faris.nextInt();
            System.out.print("Masukkan Nilai Pemangkat Ke-" + (i + 1) + " : ");
            png[i].pangkat = faris.nextInt();
        }
        System.out.println("===================================================");
        System.out.println("Hasil Pangkat dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("===================================================");
        System.out.println("Hasil Pangkat dengan Divide Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }
        System.out.println("===================================================");
    }

}
