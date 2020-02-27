package fungsi2;
/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;
public class Percobaan2 {
    public static void main(String[] Arg) {
        Scanner input = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = input.nextInt();
        System.out.print("Pangkat: ");
        pangkat = input.nextInt();       
        System.out.println(hitungPangkat(bilangan, pangkat));
    }   static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y-1);
        }
    }
}
