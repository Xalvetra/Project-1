package perulangan;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        int angka, bilgan, terbagi, nomor;
        double rata2, jumlah = 0;;
        Scanner faris = new Scanner(System.in);
        System.out.println("==== SumAvgGanjil ====");
        System.out.print("Masukan Range Bilangan Bulat : ");
        angka = faris.nextInt();

        if (angka % 2 != 0) {
            terbagi = (angka / 2) + 1;
            System.out.println("Banyaknya Bilangan ganjil dari 1 sampai "
                    + angka + " adalah " + terbagi);

            for (nomor = 1, bilgan = 1; nomor <= terbagi; nomor++, bilgan += 2) {
                System.out.println("Bilangan ganjil Ke-" + nomor + " adalah " + bilgan);
                jumlah += (bilgan * bilgan);
            }
            rata2 = jumlah / terbagi;
            System.out.println("Jumlah bilangan ganjil dari 1 sampai " + angka + " = " + jumlah);
            System.out.println("Rata-rata bilangan ganjil dari 1 sampai " + angka + " = " + rata2);

        } else {
            terbagi = angka / 2;
            System.out.println("Banyaknya Bilangan ganjil dari 1 sampai "
                    + angka + " adalah " + terbagi);
            for (nomor = 1, bilgan = 1; nomor <= terbagi; nomor++, bilgan += 2) {
                System.out.println("Bilangan ganjil Ke-" + nomor + " adalah " + bilgan);
                jumlah += (bilgan * bilgan);
            }
            rata2 = (double) jumlah / terbagi;
            System.out.println("Jumlah bilangan ganjil dari 1 sampai " + angka + " = " + jumlah);
            System.out.println("Rata-rata bilangan ganjil dari 1 sampai " + angka + " = " + rata2);

        }
    }
}
