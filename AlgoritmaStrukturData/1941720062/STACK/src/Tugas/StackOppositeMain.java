package Tugas;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class StackOppositeMain {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan jumlah data Stack : ");
        int size = faris.nextInt();
        StackOpposite st = new StackOpposite(size);
        System.out.print("Masukkan kalimat: ");
        for (int i = 0;i < size;  i++) {
            String isi = faris.next();
            st.Push(isi);
        }
        st.tampil();
    }
}
