package fungsi2;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] Args) {
        int angka;
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        angka = faris.nextInt();
        System.out.print(" = " + PenjumlahanRekursif(1, angka));
    }

    static int PenjumlahanRekursif(int i, int j) {
        if (i < j) {
            System.out.print(i + "+");

            return i + PenjumlahanRekursif(i + 1, j);

        } else {
            System.out.print(j);
            return j;
        }
    }
}