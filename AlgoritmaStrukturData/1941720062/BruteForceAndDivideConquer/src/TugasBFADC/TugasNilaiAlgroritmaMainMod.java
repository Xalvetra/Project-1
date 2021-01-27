
package TugasBFADC;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TugasNilaiAlgroritmaMainMod {
     public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa = ");
        int x = faris.nextInt();
        TugasNilaiAlgroritmaMod[] mhs = new TugasNilaiAlgroritmaMod[x];
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("====================");
            System.out.println("MAHASISWA KE- " + (i + 1));
            System.out.println("====================");
            System.out.print("Masukkan Nilai UAS Mahasiswa KE- " + (i + 1) + " = ");
            int UAS = faris.nextInt();
            System.out.print("Masukkan Nilai Tugas Mahasiswa KE- " + (i + 1) + " = ");
            int Tugas = faris.nextInt();
            System.out.print("Masukkan Nilai Quiz Mahasiswa KE- " + (i + 1) + " = ");
            int Quiz = faris.nextInt();
            System.out.print("Masukkan Nilai UTS Mahasiswa KE- " + (i + 1) + " = ");
            int UTS = faris.nextInt();
            mhs[i] = new TugasNilaiAlgroritmaMod(Tugas, Quiz, UTS, UAS,x);
        }
        System.out.println("===================================================================================================");
        double total = 0;
        for (int j = 0; j < x; j++) {
        System.out.println("Total Nilai Rata Rata Semua Mahasiswa Adalah Dalam Divide And Conquer : "+mhs[j].hitungRataRataDC(x));
        }
    }
}