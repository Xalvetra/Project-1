package array1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Tugas4 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int[] index;
        int pilih;
        int jumlah = 0;
        
        int [][] Jarak = new int [4][2];
        Jarak [0][0] = 70;
        Jarak [0][1] = 80;
        Jarak [1][0] = 90;
        Jarak [1][1] = 100;
        Jarak [2][0] = 110;
        Jarak [2][1] = 120;
        Jarak [3][0] = 130;
        Jarak [3][1] = 140;
        
        
        for(int i=0 ; i<4 ; i++){
            for (int j=0;j<2;j++){
                System.out.println(Jarak[i][j]+""); 
            }
            System.out.println();
        }

        System.out.print("Masukkan Isi Array : ");
        int N = faris.nextInt();

        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Array ke-" + i + " : ");
            array[i] = faris.nextInt();

        }
        int[] arrayDelete = new int[array.length - 1];

        System.out.println();
        System.out.print("Masukkan Elemen Yang Ingin Anda Hapus : ");
        pilih = faris.nextInt();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == pilih) {
                jumlah = i;
            }
        }

        for (int x = 0; x < jumlah; x++) {
            arrayDelete[x] = array[x];
        }
        for (int y = jumlah + 1; y < array.length; y++) {
            arrayDelete[y - 1] = array[y];
        }
        System.out.println("Setelah DiHapus : ");
        for (int z = 0; z < arrayDelete.length; z++) {
            System.out.print(arrayDelete[z] + " ");
        }

    }
}