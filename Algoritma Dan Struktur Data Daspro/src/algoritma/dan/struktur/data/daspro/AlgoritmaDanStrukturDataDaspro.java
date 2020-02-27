package algoritma.dan.struktur.data.daspro;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class AlgoritmaDanStrukturDataDaspro {

    public static void main(String[] args) {
        double UAS, Tugas, UTS, nilai;
        Scanner faris = new Scanner(System.in);

        System.out.print("Masukkan Nilai UAS Anda = ");
        UAS = faris.nextDouble();
        System.out.print("Masukkan Nilai Tugas Anda = ");
        Tugas = faris.nextDouble();
        System.out.print("Masukkan Nilai UTS anda = ");
        UTS = faris.nextDouble();
        
        if (UTS >= 0 && UTS <= 100 && UAS >= 0 && UAS <= 100 && Tugas >= 0 && Tugas <= 100) {

            nilai = UAS * 0.45 + Tugas * 0.20 + UTS * 0.35;

            if (nilai >= 90 && nilai <= 100) {
                System.out.println(nilai + " = Nilai A, EXCELLENT!");
            } else if (nilai >= 85 && nilai <= 89) {
                System.out.println(nilai + " = Nilai B+, pertahankan prestasi Anda!");
            } else if (nilai >= 80 && nilai <= 84) {
                System.out.println(nilai + "= Nilai B, pertahankan prestasi Anda!");
            } else if (nilai >= 60 && nilai <= 79) {
                System.out.println(nilai + " = Nilai C,Tingkatkan prestasi Anda");
            } else if (nilai >= 50 && nilai <= 59) {
                System.out.println(nilai + "= Nilai D, tingkatkan belajar Anda!");
            } else {
                System.out.println(nilai + " = Nilai E, Anda Tidak Lulus!");
            }

        }else{
            System.out.println("Salah Satu Nilai Yang Anda Masukkan Salah");
        }
    
}
}