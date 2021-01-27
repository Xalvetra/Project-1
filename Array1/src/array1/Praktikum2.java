package array1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Praktikum2 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int[] nilaiUAS = new int[6];

        for (int i = 0; i < nilaiUAS.length; i++) {
            System.out.print("Masukkan nilai UAS ke-" + i + ": ");
            nilaiUAS[i] = faris.nextInt();
        }
        for (int i = 0; i < 6; i++) {
            
            if(nilaiUAS[i] > 70){
               System.out.println("Mahasiswa Ke- "+i+" Lulus!");
        }
            else{
                System.out.println("Mahasiswa Ke- "+i+" Tidak Lulus!");
            }
        }

    }

}
