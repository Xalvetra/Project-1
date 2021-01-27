package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

/**
 * BinaryTreeMain
 */
public class BinaryTreeMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        String menu[] = {"add", "delete", "find", "traverse  inOrder", "traverse preOrder", "traverse postOrder", "keluar"};
        int pilih, data;

        do {
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ".  " + menu[i]);
            }
            System.out.print("Pilih  salah  satu  menu:  ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan  tambahan  data  angka:  ");
                    data = sc.nextInt();
                    bt.add(data);
                    break;
                case 2:
                    System.out.print("Masukkan  data  yang  akan  dihapus:");
                    data = sc.nextInt();
                    bt.delete(data);
                    break;
                case 3:
                    System.out.print("Masukkan  data  yang  ingin  dicari:");
                    data = sc.nextInt();
                    System.out.println(bt.find(data));
                    break;
                case 4:
                    bt.traverseInOrder(bt.root);
                    System.out.println();
                    break;
                case 5:
                    bt.traversePreOrder(bt.root);
                    System.out.println();
                    break;
                case 6:
                    bt.traversePostOrder(bt.root);
                    System.out.println();
                    break;
            }
        } while (pilih > 0 || pilih < menu.length - 1);
    }
}