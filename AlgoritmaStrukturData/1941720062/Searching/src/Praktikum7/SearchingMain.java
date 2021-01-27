package Praktikum7;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class SearchingMain {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        int data[] =new int[8];
        for(int i = 0 ; i <data.length;i++){
            System.out.print("Masukkan Elemen Ke - "+(i+1)+" : ");
            data[i] = faris.nextInt();
        }
        for(int m : data){
            System.out.print(m+" ");
        }
        System.out.println("");
        int cari;
        System.out.print("Masukkan Angka Yang Ingin Anda Cari : ");
        cari = faris.nextInt();
        Searching pencarian = new Searching(data, 8);
        System.out.println("Isi Array : ");
        pencarian.TampilData();

        System.out.println("Menggunakan Sequential Search : ");
        int posisi = pencarian.FindSeqSearch(cari);
        if (posisi != -1) {
            System.out.println("Data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
        System.out.println("=========================");
        System.out.println("Menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.Tampilposisi(cari, posisi);
    }
}
