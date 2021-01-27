package testfaris;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class TestPengurutan {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);

        int bil, j, urut;
        System.out.print("Masukkan Panjang Array: ");
        bil = faris.nextInt();

        int[] array = new int[bil];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemen Array Index Ke " + i + " : ");
            array[i] = faris.nextInt();

        }
        for (int i = 0; i < array.length; i++) {
            for (j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    urut = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = urut;
                }
            }
        }
        System.out.println();
        System.out.println("Hasil Urutan");
        System.out.println("==============");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("==============");
    }
}
