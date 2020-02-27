package Function1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);

        System.out.print("Masukkan Bil 1 = ");
        int A = faris.nextInt();
        System.out.print("Masukkan Bil 2 = ");
        int B = faris.nextInt();
        System.out.print("Masukkan Bil 3 = ");
        int C = faris.nextInt();
        System.out.print("Nilai Maksimum Adalah : " + Max3(A, B, C));
    }

    static int Max3(int bil1, int bil2, int bil3) {
        int simpan;
        if (bil1 > bil2 || bil1 > bil3) {
            simpan = bil1;
        } else if (bil2 > bil3 || bil2 > bil1) {
            simpan = bil2;
        } else {
            simpan = bil3;

        }
        return(simpan);
    }
}
