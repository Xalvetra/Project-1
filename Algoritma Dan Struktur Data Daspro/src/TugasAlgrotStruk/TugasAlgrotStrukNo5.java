package TugasAlgrotStruk;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class TugasAlgrotStrukNo5 {

    static Scanner faris = new Scanner(System.in);
    static double alas, tinggi, jari2, panjang, lebar;

    public static void main(String[] Args) {
        char jenis;

        System.out.println("Fungsi Menghitung Luas : ");
        System.out.println("1. Segitiga");
        System.out.println("2. Segiempat");
        System.out.println("3. Lingkaran");
        System.out.println("4. Keluar");
        jenis = faris.next().charAt(0);
        switch (jenis) {
            case '1':
                System.out.println("=== Anda Memilih Segitiga ===");
                System.out.println("Masukkan Panjang Alas = ");
                alas = faris.nextInt();
                System.out.println("Masukkan Tinggi = ");
                tinggi = faris.nextInt();
                System.out.println("Luas Segitiga : " + LuasSegitiga(alas,tinggi));
                break;
            case '2':
                System.out.println("=== Anda Memilih Segiempat ===");
                System.out.println("Masukkan Panjang = ");
                panjang = faris.nextInt();
                System.out.println("Masukkan Lebar = ");
                lebar = faris.nextInt();
                System.out.println("Luas Segiempat : " + LuasSegiempat(panjang, lebar));
                System.out.println("Keliling Segiempat : " + KelilingSegiempat(panjang, lebar));
                break;
            case '3':
                System.out.println("=== Anda Memilih Lingkaran ===");
                System.out.println("Masukkan Jari-Jari = ");
                jari2 = faris.nextInt();
                System.out.println("Keliling Lingkaran : " + KelilingLingkaran(jari2));
                System.out.println("Luas Lingkaran : " + LuasLingkaran(jari2));
                break;
            case '4':
                System.out.println("Terima Kasih Telah Menggunakan Program Ini");
        }
    }

    static double LuasLingkaran(double n) {
        double phi = 3.14, L;
        L = n * n * phi;
        return (L);
    }

    static double KelilingLingkaran(double n) {
        double phi = 3.14, K;
        K = 2 * n * phi;
        return (K);
    }

    static double LuasSegiempat(double m, double o) {
        double L;
        L = m * o;
        return (L);
    }

    static double KelilingSegiempat(double m, double o) {
        double K;
        K = m * o;
        return (K);
    }

    static double LuasSegitiga(double j, double k) {
        double L;
        L = j * k * 0.5;
        return (L);
    }

}
