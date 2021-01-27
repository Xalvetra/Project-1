package Tugas;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class StackKalimatMain {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        Scanner haq = new Scanner(System.in);
        System.out.print("Anda Ingin Ada Berapa Nama Mahasiswa : ");
        int tumpuk = faris.nextInt();
        StackKalimat tumpukan = new StackKalimat(tumpuk);
        String nama;
        int data[] = new int[tumpuk];
        String pilih;
        for (int i = 0; i < tumpukan.size; i++) {
            System.out.print("Masukkan Nama Mahasiswa Ke - " + (i + 1) + " : ");
            nama = haq.nextLine();
            tumpukan.push(nama);
        }
        tumpukan.print();
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
    }
}
