package Praktikum;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class MainLinkedLists {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        LinkedLists data = new LinkedLists();

        int pilih, Pilsub;
        do {
            System.out.println();
            menu();
            System.out.println("====================");
            System.out.print("Masukkan Pilihan : ");
            pilih = faris.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("");
                    Tambah();
                    System.out.println("====================");
                    System.out.print("Pilih : ");
                    Pilsub = faris.nextInt();
                    switch (Pilsub) {
                        case 1:
                            System.out.println("Masukkan Angka : ");
                            int Angka = faris.nextInt();

                            try {
                                data.addFirst(Angka);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.println();
                            int angkaTambah = faris.nextInt();
                            System.out.println("Index Yang Diinginkan : ");
                            int indexTambah = faris.nextInt();
                            try {
                                data.add(angkaTambah, indexTambah);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        case 3:
                            System.out.println("Masukkan Data : ");
                            int AngkaAkhir = faris.nextInt();
                            try {
                                data.addLast(AngkaAkhir);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                    }
                    break;
                case 2:
                    System.out.println();
                    Hapus();
                    System.out.println("====================");
                    System.out.print("Pilih : ");
                    Pilsub = faris.nextInt();
                    switch (Pilsub) {
                        case 1:
                            System.out.println("Index Yang Ingin Dihapus : ");
                            int IndexRes = faris.nextInt();

                            try {
                                data.remove(IndexRes);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.println("Angka Yang Ingin Diapus : ");
                            int angkaRemove = faris.nextInt();
                            try {
                                data.removeByValue(angkaRemove);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                        case 3:
                            data.clear();
                            data.print();
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                    }
                    break;
                case 3:
                    System.out.println("");
                    Cari();
                    System.out.println("====================");
                    System.out.print("Pilih : ");
                    Pilsub = faris.nextInt();
                    switch (Pilsub) {
                        case 1:
                            System.out.println("Masukkan Index Untuk Melihat Dala Didalanya : ");
                            int indexSC = faris.nextInt();
                            try {
                                data.cariidx(indexSC);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 2:
                            System.out.println("Angka Yang Ingin Anda Cari : ");
                            int AngkaSC = faris.nextInt();
                            try {
                                data.carikey(AngkaSC);
                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("Pilihan Tidak Tersedia");
                    }
                    break;
                case 4:
                    System.out.println();
                    System.out.println("=== DATA YANG MASUK ===");
                    data.print();
                    break;
                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);

    }

    static void menu() {
        System.out.println("************");
        System.out.println("*** MENU ***");
        System.out.println("************");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Print");
        System.out.println("5. Keluar");
        System.out.println("************");
    }

    static void Tambah() {
        System.out.println("=== SUB MENU ===");
        System.out.println("1.Tambah (Index)");
        System.out.println("2.Tambah (Pencarian)");
        System.out.println("3.CLEAR");
    }

    static void Hapus() {
        System.out.println("=== SUB MENU ===");
        System.out.println("1.Hapus (Index)");
        System.out.println("2.Hapus (Pencarian)");
        System.out.println("3.CLEAR");
    }

    static void Cari() {
        System.out.println("=== SUB MENU ===");
        System.out.println("1.Cari (Index)");
        System.out.println("2.Cari (Pencarian)");
    }
}
