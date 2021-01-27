package bubble.selection.insertion.sorting;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Main {

    public static void main(String[] Args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerpretasi data = new DaftarMahasiswaBerpretasi();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Thn Masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("IPK = ");
            double ipk = s.nextDouble();
            System.out.println("======================");
            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);

        }
        System.out.println("Data Mahasiswa Sebelum Sorting = ");
        data.tampil();
        System.out.println("Data Mahasiswa Setelah Sorting Desc Berdasar IPK = ");
        data.bubbleSort();
        data.tampil();
        System.out.println("Data Mahasiswa Seteah Sorting ASC berdasar IPK = ");
        data.insertionSort();
        data.tampil();
        
    }
}
