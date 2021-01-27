package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class QueueNasabahMain {

    public static void main(String[] args) {
        String menu[] = {"Enqueue", "Dequeue", "Print",
            "Peek", "Peek Rear", "Peek Position", "print Nasabah"};
        int pilih;
        Scanner faris = new Scanner(System.in);
        QueueNasabah nsbh = new QueueNasabah();
        System.out.print("Masukkan Jumlah Nasabah : ");
        int max = faris.nextInt();
        QueueNasabah nsbhmx = new QueueNasabah(max);

        do {
            System.out.println("Pilih Salah Satu : ");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i]);
            }
            System.out.print("Silahkan Dipilih : ");
            pilih = faris.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("");
                    System.out.print("Masukkan Nama Nasabah : ");
                    String nm = faris.next();
                    System.out.print("Masukkan Nomor Rekening nasabah: ");
                    String noRek = faris.next();
                    Nasabah nas1 = new Nasabah(noRek, nm);

                    nsbhmx.Enqueue(nas1);
                    break;
                case 2:
                    Nasabah dtKeluar = nsbhmx.Dequeue();
                    if (dtKeluar != null) {
                        System.out.println("Data yang Dikeluarkan : ");
                        dtKeluar.print();
                    }
                    break;
                case 3:
                    nsbhmx.print();
                    break;
                case 4:
                    nsbhmx.peek();
                    break;
                case 5:
                    nsbhmx.peekRear();
                    break;
                case 6:
                    System.out.println("Masukan Data : ");
                    System.out.println("");
                    System.out.print("Nama Nasabah : ");
                    String nama = faris.next();
                    System.out.print("Rekening : ");
                    String Rekening = faris.next();
                    nas1 = new Nasabah(Rekening, nama);
                    nsbhmx.peekPosition(nas1);
                    break;
                case 7:
                    System.out.print("Masukkan Letak Antrian Nasabah : ");
                    int posisi = faris.nextInt();
                    nsbhmx.printNasabah(posisi);
                    break;
            }
        } while (pilih >= 1 || pilih <= menu.length);
    }
}
