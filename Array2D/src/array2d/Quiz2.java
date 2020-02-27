package array2d;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        String namaKelompok[][];
        namaKelompok = new String[3][3];

        for (int i = 0; i < namaKelompok.length; i++) {
            for (int j = 0; j < namaKelompok[0].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "] : ");
                namaKelompok[i][j] = faris.nextLine();
            }
            System.out.println("=================");
        }
        for (int i = 0; i < namaKelompok.length; i++) {
            for (int j = 0; j < namaKelompok[0].length; j++) {
                System.out.print(namaKelompok[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Masukkan Nama Anggota :");
        String nama = new String();

        for (int i = 0; i < namaKelompok.length; i++) {
            for (int j = i ; j < namaKelompok[0].length; j++) {
                int jumlah = 0;
                if (nama.equalsIgnoreCase(namaKelompok[i][j])) {
                    jumlah++;
                    
                    System.out.println(nama+"="+jumlah);
                }
            }

        }
    }
}