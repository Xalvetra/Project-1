package Tugas1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class MahasiswaMain {

    String nim, nama, alamat;

    public MahasiswaMain(String n, String nm, String add) {
        nim = n;
        nama = nm;
        alamat = add;
    }

    MahasiswaMain() {

    }

    public static void menuUtama() {
        System.out.println("=====================");
        System.out.println("	Menu	Utama");
        System.out.println("=====================");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("4. Keluar");
        System.out.print("Pilih Menu Utama : ");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Mahasiswa data = new Mahasiswa();
        int menu;
        int submenu;
        try {
            do {
                menuUtama();
                menu = sc.nextInt();
                if (menu == 1) {
                    System.out.println("=====================");
                    System.out.println("     Menu Tambah     ");
                    System.out.println("=====================");
                    System.out.println("1. First");
                    System.out.println("2. Index");
                    System.out.println("3. Last");
                    System.out.print("Pilih Sub Menu : ");
                    submenu = sc.nextInt();
                    sc.nextLine();
                    if (submenu == 1) {
                        Mahasiswa addf = new Mahasiswa();
                        System.out.print("Masukkan NIM : ");
                        addf.nim = sc.nextLine();
                        System.out.print("Masukkan Nama : ");
                        addf.nama = sc.nextLine();
                        System.out.print("Masukkan Alamat : ");
                        addf.alamat = sc.nextLine();
                        data.addFirst(addf);
                        System.out.println("=============================");
                        data.print();
                    } else if (submenu == 2) {
                        Mahasiswa add = new Mahasiswa();
                        System.out.print("Masukkan Index : ");
                        int in = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Masukkan NIM : ");
                        add.nim = sc.nextLine();
                        System.out.print("Masukkan Nama : ");
                        add.nama = sc.nextLine();
                        System.out.print("Masukkan Alamat : ");
                        add.alamat = sc.nextLine();
                        data.add(add, in);
                        System.out.println("=============================");
                        data.print();
                    } else if (submenu == 3) {
                        Mahasiswa addl = new Mahasiswa();
                        System.out.print("Masukkan NIM : ");
                        addl.nim = sc.nextLine();
                        System.out.print("Masukkan Nama : ");
                        addl.nama = sc.nextLine();
                        System.out.print("Masukkan Alamat : ");
                        addl.alamat = sc.nextLine();
                        data.addLast(addl);
                        System.out.println("=============================");
                        data.print();
                    } else {
                        System.exit(0);
                    }
                } else if (menu == 2) {
                    System.out.println("=====================");
                    System.out.println("     Menu   Hapus    ");
                    System.out.println("=====================");
                    System.out.println("1. First");
                    System.out.println("2. Index");
                    System.out.println("3. Clear");
                    System.out.print("Pilih Sub Menu : ");
                    submenu = sc.nextInt();
                    if (submenu == 1) {
                        data.removeFirst();
                        System.out.println("=============================");
                        data.print();
                    } else if (submenu == 2) {
                        try {
                            System.out.print("Input Index : ");
                            int in = sc.nextInt();
                            data.remove(in);
                            System.out.println("=============================");
                            data.print();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else if (submenu == 3) {
                        data.clear();
                        System.out.println("Clear Data Berhasil");
                        System.out.println("=============================");
                        data.print();
                    } else {
                        System.exit(0);
                    }

                } else if (menu == 3) {
                    System.out.println("=====================");
                    System.out.println("      Menu Cari      ");
                    System.out.println("=====================");
                    System.out.println("1. First");
                    System.out.println("2. Last");
                    System.out.println("3. Index");
                    System.out.print("Pilih Sub Menu : ");
                    submenu = sc.nextInt();
                    if (submenu == 1) {
                        System.out.println("Data Awal	: "
                                + data.getFirst());
                    } else if (submenu == 2) {
                        System.out.println("Data Akhir	: "
                                + data.getLast());
                    } else if (submenu == 3) {
                        System.out.print("Masukkan Index : ");
                        int in = sc.nextInt();
                        System.out.println("Data index ke-" + in
                                + " : " + data.get(in));
                    } else {
                        System.exit(0);
                    }
                } else if (menu == 4) {
                    System.exit(0);
                }
            } while (menu == 1 || menu == 2 || menu == 3 || menu == 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
