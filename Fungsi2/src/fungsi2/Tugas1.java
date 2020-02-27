package fungsi2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] Args) {
        int angka;
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        angka = faris.nextInt();
        DeretDescending(angka);
    }

    static void DeretDescending(int n) {
        if(n >= 0){
            System.out.print(n+ " ");
            DeretDescending(n -= 1);
        }
    }

}