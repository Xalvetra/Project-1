package Praktikum;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class QueueMain {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        int pilih;
        System.out.print("Masukkan Jumlah Maksimal Data Antrian = ");
        int n = faris.nextInt();
        Queue Q = new Queue(n);
        do {
            menu();
            pilih = faris.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Data Baru = ");
                    int dtMasuk = faris.nextInt();
                    Q.enqueue(dtMasuk);
                    break;
                case 2:
                    int dtKlr = Q.dequeue();
                    if (dtKlr != 0) {
                        System.out.println("Data yang terambil = " + dtKlr);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }

    static void menu() {
        System.out.println("Pilih Operasi Yang Ingin Dilakukan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("-------------------------------------");
    }
}
