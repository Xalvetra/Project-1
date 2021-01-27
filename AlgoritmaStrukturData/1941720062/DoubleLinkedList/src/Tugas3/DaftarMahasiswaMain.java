package Tugas3;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class DaftarMahasiswaMain {

    static void menu() {

        System.out.println("==================================");
        System.out.println(" DOUBLE LINKED LIST DENGAN MENU ");
        System.out.println("==================================");
        System.out.println("1.Tambah Awal");
        System.out.println("2.Tambah Akhir");
        System.out.println("3.Tambah Data Index Tertentu");
        System.out.println("4.Hapus Awal");
        System.out.println("5.Hapus Akhir");
        System.out.println("6.Hapus Index Tertentu");
        System.out.println("7.Cetak Data");
        System.out.println("8.Cari");
        System.out.println("9.Sorting");
        System.out.println("10.Keluar");
        System.out.println("==================================");
    }

    public static void main(String[] args) throws Exception {
        Scanner faris = new Scanner(System.in);
        DaftarMahasiswa dm = new DaftarMahasiswa();
        String name;
        int nilai, menu, idx;
        do {
            menu();
            System.out.print(">>");
            menu = faris.nextInt();
            System.out.println("==================================");

            switch (menu) {
                case 1:
                    System.out.print("Masukkan Nama  : ");
                    name = faris.next();
                    System.out.print("Masukkan Nilai :");
                    nilai = faris.nextInt();
                    dm.addFirst(name, nilai);
                    break;
                case 2:
                    System.out.print("Masukkan Nama  : ");
                    name = faris.next();
                    System.out.print("Masukkan Nilai : ");
                    nilai = faris.nextInt();
                    dm.addLast(name, nilai);
                    break;

                case 3:
                    System.out.print("Masukkan Nama  : ");
                    name = faris.next();
                    System.out.print("Masukkan Nilai : ");
                    nilai = faris.nextInt();
                    System.out.print("Masukkan Posisi Index Data : ");
                    int index = faris.nextInt();
                    dm.add(name, nilai, index);
                    break;
                case 4:
                    dm.removeFirst();
                    break;

                case 5:
                    dm.removeLast();
                    dm.print();
                    break;

                case 6:
                    System.out.print("Masukkan Posisi Index Data Yang Ingin Dihapus : ");
                    idx = faris.nextInt();
                    dm.remove(idx);
                    dm.print();
                    break;
                case 7:
                    dm.print();
                    break;
                case 8:
                    System.out.print("Masukkan Nama    : ");
                    name = faris.next();
                    System.out.print("Masukkan Nilai   : ");
                    nilai = faris.nextInt();
                    dm.search(name, nilai);
                    break;
                case 9:
                    dm.Urut();
                    dm.print();
                    break;
                case 10:
                    System.exit(0);
                    break;
            }

        } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6 || menu == 7 || menu == 8 || menu == 9);
    }
}
