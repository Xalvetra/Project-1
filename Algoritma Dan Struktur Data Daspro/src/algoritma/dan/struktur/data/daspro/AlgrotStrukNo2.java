package algoritma.dan.struktur.data.daspro;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class AlgrotStrukNo2 {

    public static void main(String[] Args) {

        Scanner faris = new Scanner(System.in);
        int y;
        System.out.print("Masukkan Angka Yang Anda Inginkan = ");
        y = faris.nextInt();

        if (y % 2 == 0 && y % 6 != 0 && y % 15 != 0) {
            System.out.println("Bilagan Kelipatan 2");
        } else if (y % 6 == 0 && y % 15 != 0) {
            System.out.println("Bilangan Kelipatan 6");
        } else if (y % 15 == 0) {
             System.out.println("Bilangan Kelipatan 15");
        }else{
            System.out.println("Bilangan Bukan Kelipatan 2,6,ataupun 15");
        }
    }
}
