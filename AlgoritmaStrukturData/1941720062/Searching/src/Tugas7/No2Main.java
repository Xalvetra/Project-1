package Tugas7;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class No2Main {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int[][] data = new int[3][5];
        int posisiBar, posisiKol;
        data[0][0] = 45;
        data[0][1] = 78;
        data[0][2] = 7;
        data[0][3] = 200;
        data[0][4] = 80;
        data[1][0] = 90;
        data[1][1] = 1;
        data[1][2] = 17;
        data[1][3] = 100;
        data[1][4] = 50;
        data[2][0] = 21;
        data[2][1] = 2;
        data[2][2] = 40;
        data[2][3] = 18;
        data[2][4] = 65;
        No2 pencarian = new No2(data, 3, 5);
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        System.out.println("");
        int cari;
        System.out.print("Masukkan Angka Yang Ingin Anda Cari : ");
        cari = faris.nextInt();
        pencarian.FindSeqSearch(cari);
        int posisi = pencarian.FindSeqSearch(cari);
        if (posisi != -1) {
            posisiBar = pencarian.getPosisiBar();
            posisiKol = pencarian.getPosisiKol();
            System.out.println("Data : " + cari + " ditemukan pada BARIS : " + posisiBar + " KOLOM : " + posisiKol);
        } else {
            System.out.println("data " + cari + " tidak ditemukan ");
        }
    }
}
