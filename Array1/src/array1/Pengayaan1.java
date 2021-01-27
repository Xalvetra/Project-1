package array1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Pengayaan1 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int masukkan;
        System.out.print("Masukkan Jumlah Elemen Array : ");
        int angka = faris.nextInt();

        int[] arr = new int[angka];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Elemen Array Ke " + i + ": ");
            arr[i] = faris.nextInt();
        }
        System.out.print("Masukkan Key Yang Ingin Dicari : ");
        masukkan = faris.nextInt();
        for(int i = 0 ; i<arr.length;i++){
        if(arr[i] == masukkan){
            System.out.print("Key ada diposisi index Ke : " +i);
        }
        }
    }
}
