package testfaris;

import java.util.Scanner;

/**
 *
 * @author christian
 */
public class TesMasBro {

    public static void main(String[] args) {
        String[] angkaSis = new String[99];
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM MENCARI BILANGAN BINER ");
        System.out.print("Masukan Bilangan yang mau di konversikan : ");
        int inputBilangan = input.nextInt();
        int b = 0;

        do {
            if (inputBilangan % 2 != 0) {
                angkaSis[b] = "1";
            } else {

                angkaSis[b] = "0";
            }
            inputBilangan = inputBilangan / 2;
            b++;
        } while (inputBilangan > 0);
        System.out.println("Setelah di konversikan");
        for (int i = b - 1; i >= 0; i--) {
            System.out.print(angkaSis[i] + " ");

        }
        System.out.println("");
    }
}