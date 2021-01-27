package Tugas7;
import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class No4Main {
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        Scanner haq = new Scanner(System.in);
        System.out.println("SENSUS PENDUDUK 2020");
        System.out.print("Masukkan jumlah data: ");
        int data = faris.nextInt();

        No4 sensus = new No4(data);
        for (int i = 0; i < data; i++) {
            System.out.print("NIK\t\t: ");
            sensus.nik[i] = faris.nextInt();
            System.out.print("Nama\t\t: ");
            sensus.nama[i] = haq.nextLine();
            System.out.print("Alamat\t\t: ");
            sensus.alamat[i] = haq.nextLine();
            System.out.print("Kelamin\t\t: ");
            sensus.kelamin[i] = haq.nextLine();
            System.out.println("=====================");
        }
//        sensus.Sort();
        sensus.TampilData();
        System.out.println(
                "Masukkan NIK Penduduk yang ingin dicari:");
        int cari = faris.nextInt();
        int posisi = sensus.BinarySearch(cari, 0, data - 1);
        sensus.Tampil(cari, posisi);
    }
}