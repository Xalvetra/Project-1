package Tugas;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class BinaryTreeArrayMain {

    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        Scanner faris = new Scanner(System.in);
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        int nilai, i;
        bta.populateData(data, idxLast);
        bta.traverseOrder(0);
        System.out.println("");
        for (i = 0; i < bta.data.length; i++) {
            System.out.println("Indeks Ke-" + i);
            System.out.print("Masukkan Nilai : ");
            nilai = faris.nextInt();
            bta.add(nilai);
            System.out.println("=====================");
        }
        bta.populateData(data, idxLast);
        System.out.print("POPULATE IN ORDER\t: ");
        bta.traverseOrder(0);
        System.out.println("");
        System.out.print("TRANSVERSE POST ORDER\t: ");
        bta.traversePostOrder(0);
        System.out.println("");
        System.out.print("TRANSVERSE PRE ORDER\t: ");
        bta.traversePreOrder(0);
        System.out.println("");
    }

}
