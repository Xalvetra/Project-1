package Tugas7;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Nomer3Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nomer3 search = new Nomer3();
//        search.Tampil();
//        search.mergeSort(search.data);
        System.out.println("Setelah Diurutkan");
        search.printArray(search.data);
        System.out.print("Masukkan data yang ingin dicari : ");
        int cari = sc.nextInt();
//        int posisi = search.BinarySearch(cari, 0, search.data.length);
//        search.posisi(cari, posisi);
//        search.Max(search.data.length);
    }

}
