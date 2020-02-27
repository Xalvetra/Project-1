package Function1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Praktikum4Hitung {

    static int kali(int angka1, int angka2) {
        int hasil = (angka1 + 10) % (angka2 + 19);
        return hasil;
    }

    static int kurang(int angka1, int angka2) {
        angka1 = angka1 + 7;
        angka2 = angka2 + 4;
        int hasil = kali(angka1, angka2);
        return hasil;
    }

    static int cek(int nilai1, int nilai2) {
        int hasil = 0;
        if (nilai1 >= 0 && nilai2 >= 0) {
            hasil = kurang(nilai1, nilai2);
        } else {
            System.out.println("Error");
        }
        return hasil;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        int nilai2 = input.nextInt();
        int hasil = cek(nilai1, nilai2);
        System.out.println("Hasil akhir adalah " + hasil);
    }

}
