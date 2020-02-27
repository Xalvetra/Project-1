package algoritma.dan.struktur.data.daspro;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class AlgrotStrukNo5 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int isi, x = 0, y = 0;
        System.out.print("Masukkan Isi Array : ");
        isi = faris.nextInt();
        int array[] = new int[isi];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Masukkan Array Ke-" + (i+1) + " :");
            array[i] = faris.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                x += 1;
            } else {
                y += 1;
            }
        }
        int arrayGenap[] = new int[x];
        int arrayGanjil[] = new int[y];
        x=0;y=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayGenap[x] = array[i];
                x++;

            } else {
                arrayGanjil[y] = array[i];
                y++;
            }
        }
         
        System.out.print("Bilangan Genap : ");
        for (int i : arrayGenap) {
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.print("Bilangan Ganjil : ");
        for (int i : arrayGanjil) {
            System.out.print(i +" ");
        }
    }
}
