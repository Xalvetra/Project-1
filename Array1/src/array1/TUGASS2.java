package array1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class TUGASS2 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Array : ");
        int angka = faris.nextInt();
        int[] array = new int[angka];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Array Ke-" + i + " :");
            array[i] = faris.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Angka Genap :" + array[i]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("Angka ganjil :" + array[i]);
            }

        }
    }

}
