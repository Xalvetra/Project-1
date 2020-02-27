package fungsi2;
import java.util.Scanner;
/**
 *
 * @author Faris Ikhlasul H
 */
public class Tugas3 {
    static int bil;
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Bilangan :");
        bil = faris.nextInt();
        if (bil > 1) {
            int p = Prima(bil - 1);
            if (p == 1) {
                System.out.println(bil + " bilangan PRIMA");
            } else {
                System.out.println(bil + " bilangan BUKAN PRIMA");
            }
        } else {
            System.out.println(bil + " bilangan BUKAN PRIMA");
        }
    }
    public static int Prima(int p) {
        if (p == 1) {
            return 1;
        } else if (bil % p == 0) {
            return 0;
        } else {
            return Prima(p - 1);
        }
    }
}