package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class StackMain {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        Stack tumpukan = new Stack(4);
        for (int i = 0; i < tumpukan.size; i++) {
            System.out.print("Masukkan data: ");
            int data = faris.nextInt();
            tumpukan.push(data);
        }
//        tumpukan.push(15);
//        tumpukan.push(31);
//        tumpukan.push(9);
//        tumpukan.push(12);
        tumpukan.print();
        tumpukan.pop();
//        tumpukan.push(17);
//        tumpukan.push(98);
        tumpukan.peek();
        tumpukan.print();
    }
}