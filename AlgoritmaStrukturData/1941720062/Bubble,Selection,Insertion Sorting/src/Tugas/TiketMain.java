package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class TiketMain {

    public static void main(String[] Args) {
        char pilih, choose;
        Tiket data = new Tiket();
        Scanner faris = new Scanner(System.in);
        Scanner haq = new Scanner(System.in);
        String namaPesawat[] = {"Garuda","Citilink","Sriwijaya","Lion Air","Batik Air"};
        float hargaTiket[] = {1200000, 400000, 900000, 544000, 1100000};
        int jumlahTiket[] = {400, 300, 300, 300, 450};
        int jumlahTiketTerjual[] = {100, 200, 50, 250, 200};
        int jumlahTiketTersedia[] = new int[5];
        System.out.println("Berikut Harga Tiket Pesawat Jurusan Surabaya - Jakarta");
        System.out.println("======================================================");
        for (int i = 0; i < namaPesawat.length; i++) {
            jumlahTiketTersedia[i] = jumlahTiket[i] - jumlahTiketTerjual[i];
            System.out.println((i+1)+". "+namaPesawat[i]);
            System.out.println("Tiket " + (jumlahTiketTersedia[i] + jumlahTiketTerjual[i]));
            System.out.println("Tiket terjual " + jumlahTiketTerjual[i]);
            System.out.println("Tiket tersedia " + jumlahTiketTersedia[i]);
            System.out.println();
        }
        System.out.println("======================================================");
        System.out.println("Data Masih Belum Urut, Anda Memilih Model Apa ?");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Anda Ingin Model Filter Menggunakan Apa (1-2) : ");
        choose = faris.next().charAt(0);
        System.out.println("=======================================================");
        System.out.println("Filter Ascending / Descending Menurut : ");
        System.out.println("1. Harga");
        System.out.println("2. Tiket Tersedia");
        System.out.print("Anda Ingin Sorting Filter Menggunakan Apa (1-2) : ");
        pilih = faris.next().charAt(0);

        if (choose == '2') {
            System.out.println("Data Mahasiswa Setelah Sorting Desc Berdasar User = ");
            data.bubbleSortDESC();
            data.tampil();
        } else if (choose == '1') {
            System.out.println("Data Mahasiswa Seteah Sorting ASC berdasar User = ");
            data.selectionSortASC();
            data.tampil();
        } else {
            System.out.println("Data Yang Anda Masukkan Tidak Sesuai");
        }
    }
}
