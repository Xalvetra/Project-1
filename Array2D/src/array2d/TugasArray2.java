package array2d;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class TugasArray2 {
    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int channel, row, column, i, j, k = 0, channel1, row1, column1;
        int[][] tabel;
        int[][] tambahan;
        int[][] kurang;
        String[] menu = {
                    "1. Tambah Matriks",
                    "2. Kurang Matriks",
                    "3. Nilai Maksimum Matriks",
                    "4. Keluar"
                         };
        System.out.print("Masukkan Ukuran Matriks(Baris) :");
        row = faris.nextInt();
        System.out.print("Masukkan Ukuran Matriks(Kolom) :");
        column = faris.nextInt();
        tabel = new int[row][column];

        for (j = 0; j < tabel.length; j++) {
            for (k = 0; k < tabel[0].length; k++) {
                System.out.print("Masukkan isi matriks" + "[" + j + "]" + "[" + k + "] : ");
                tabel[j][k] = faris.nextInt();
            }
            System.out.println("=================");

        }
        System.out.println("Jenis Matriks  : " + row + "x" + column);

        for (j = 0; j < tabel.length; j++) {
            for (k = 0; k < tabel[0].length; k++) {
                System.out.print(tabel[j][k] + " ");
            }
            System.out.println();
        }

        System.out.println("============");
        System.out.println("Menu Pilihan");

        for (int x = 0; x < menu.length; x++) {
            System.out.println(menu[x]);
        }
        System.out.println("===================");

        System.out.print("Tentukan Pilihan Anda :");
        char input = faris.next().charAt(0);

        if (input == '1') {
            System.out.print("Tambah (Baris) :");
            row = faris.nextInt();
            System.out.print("Tambah (Kolom) :");
            column = faris.nextInt();
            tambahan = new int[tabel.length + row][tabel[0].length + column];

            for (j = 0; j < tambahan.length; j++) {
                for (k = 0; k < tambahan[0].length; k++) {
                    if (j < tabel.length && k < tabel[0].length) {
                        tambahan[j][k] = tabel[j][k];
                    } else {
                        System.out.print("Masukkan isi matriks" + "[" + j + "]" + "[" + k + "] : ");
                        tambahan[j][k] = faris.nextInt();
                    }
                }
                System.out.println("----------------");
            }
            System.out.println("Tabel Baru Anda Adalah ");
            for (j = 0; j < tambahan.length; j++) {
                for (k = 0; k < tambahan[0].length; k++) {
                    System.out.print(tambahan[j][k] + " ");
                }
                System.out.println();
            }
        } else if (input == '2') {
            System.out.print("Kurang (Baris) :");
            row = faris.nextInt();
            System.out.print("Kurang (Kolom) :");
            column = faris.nextInt();
            kurang = new int[tabel.length - row][tabel[0].length - column];
            for (j = 0; j < kurang.length; j++) {
                for (k = 0; k < kurang[0].length; k++) {
                    if (j < tabel.length && k < tabel[0].length) {
                        kurang[j][k] = tabel[j][k];
                    }
                }
            }
            System.out.println("Tabel Baru Anda Adalah ");
            for (j = 0; j < kurang.length; j++) {
                for (k = 0; k < kurang[0].length; k++) {
                    System.out.print(kurang[j][k] + " ");
                }
                System.out.println();
            }
        } else if (input == '3') {
            for (j = 0; j < tabel.length; j++) {
                for (k= 0; k < tabel[0].length; k++) {
                    if (tabel[0][0]< tabel[j][k]) {
                        tabel[0][0] = tabel[j][k];
                    }
                }
            }
            System.out.println("Angka Terbesar Adalah : " + tabel[0][0]);
        }else if(input =='4'){
            System.out.println("Terima Kasih Telah Menggunakan Program By Faris Ikhlasul Haq");
        }else{
            System.out.println("Kode Yang Anda Masukkan Salah");
        }
    }
}