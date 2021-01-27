package Tugas;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Tugas1Main {
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan Jumlah Maksimal Data Antrian = ");
        int n = faris.nextInt();
        Tugas1 q = new Tugas1(n);
        do {
            menu();
            pilih = faris.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Data Baru = ");
                    int dtMasuk = faris.nextInt();
                    q.enqueue(dtMasuk);
                    break;
                case 2:
                    int dtKlr = q.dequeue();
                    if (dtKlr != 0) {
                        System.out.println("Data yang terambil = " + dtKlr);
                    }
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.peekRear();
                    break;
                case 6:
                    System.out.println("Masukkan data yang ingin dicari :");
                    int posDat = faris.nextInt();
                    // int posisi = Q.Q;
                    q.peekPosition(posDat);
                    break;
                case 7:
                    System.out.println("Masukkan posisi nilai yang ingin dicari: ");
                    int posisi = faris.nextInt();
                    q.PositionAt(posisi);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }

    static void menu() {
        System.out.println("Pilih Operasi Yang Ingin Dilakukan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. PeekRear");
        System.out.println("6. PeekPosition");
        System.out.println("7. PositionAt");
        System.out.println("-------------------------------------");
    }
}
