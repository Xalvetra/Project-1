package Tugas2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Tugas2Main {

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
        Tugas2 doublell = new Tugas2();
        int menu = 0;
        int data;
        do {
            menu();
            System.out.print(">>");
            menu = faris.nextInt();
            System.out.println("==================================");

            try {
                switch (menu) {
                    case 1:
                        System.out.print("Masukkan Data: ");
                        data = faris.nextInt();
                        doublell.addFirst(data);
                        break;
                    case 2:
                        System.out.print("Masukkan Data: ");
                        data = faris.nextInt();
                        doublell.addLast(data);
                        break;

                    case 3:
                        System.out.print("Masukkan Data: ");
                        data = faris.nextInt();
                        System.out.print("Masukkan Posisi Index Data: ");
                        int index = faris.nextInt();
                        doublell.add(data, index);
                        break;
                    case 4:
                        doublell.removeFirst();
                        break;

                    case 5:
                        doublell.removeLast();
                        doublell.print();
                        break;

                    case 6:
                        System.out.print("Masukkan Posisi Index Data Yang Ingin Dihapus: ");
                        int idx = faris.nextInt();
                        doublell.remove(idx);
                        doublell.print();
                        break;

                    case 7:

                        doublell.print();
                        break;
                    case 8:
                        System.out.print("Data yang ingin dicari: ");
                        data = faris.nextInt();
                        doublell.get(data);
                        break;
                    case 9:
                        doublell.sortAscending();
                        doublell.print();
                        break;
                    case 10:

                        doublell.clear();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6 || menu == 7 || menu == 8 || menu == 9 || menu == 10);
    }
}
