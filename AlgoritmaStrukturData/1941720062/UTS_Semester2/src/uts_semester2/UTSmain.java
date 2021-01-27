package uts_semester2;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class UTSmain {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        Scanner haq = new Scanner(System.in);
        char[] nama = {'f', 'a', 'r', 'i', 's', 'i', 'k', 'h', 'l', 'a', 's', 'u', 'l', 'h', 'a', 'q'};
        char[] nim = {'1', '9', '4', '1', '7', '2', '0', '0', '6', '2'};
        System.out.println("*** UTS - Praktikum ASD - ***");
        System.out.println("~~~ Progam Pencarian Data ~~~");
        System.out.println("");
        System.out.print("NAMA : ");
        for (char i : nama) {
            System.out.print(nama);
            break;
        }
        System.out.println("");
        System.out.print("NIM  : ");
        for (char i : nim) {
            System.out.print(nim);
            break;
        }
        UTSProcess SortAndMerge = new UTSProcess();
        System.out.println("");
        System.out.println("");
        System.out.print("DATA : ");
        SortAndMerge.TampilData(nama);
        System.out.println("");
        System.out.println("Pilih Metode Pencarian : ");
        System.out.println("1. Sequential Search ");
        System.out.println("2. Binary Search");
        System.out.println("");
        System.out.print("Pilih Metode Nomor : ");
        int pilih = faris.nextInt();
        System.out.print("Data yang dicari   : ");
        char cari = haq.next().charAt(0);

        if (pilih == 1) {
            System.out.println("Hasil pengurutan data dengan Merge Sort: ");
            SortAndMerge.Sort(nama, 0, nama.length - 1);
            SortAndMerge.TampilData(nama);
            System.out.println("Menggunakan Sequential Search : ");
            SortAndMerge.Sort(nama, 0, nama.length - 1);
            SortAndMerge.SeqSearch(nama, cari);
        } else if (pilih == 2) {
            System.out.println("=========================");

            System.out.println("Hasil pengurutan data dengan Merge Sort: ");
            SortAndMerge.Sort(nama, 0, nama.length - 1);
            SortAndMerge.TampilData(nama);

            System.out.println("Hasil pencarian dengan Binary Search: ");
            System.out.print("huruf '" + cari + "' ");
            SortAndMerge.printArray(nama, cari);
            System.out.println("");

        }
    }
}
