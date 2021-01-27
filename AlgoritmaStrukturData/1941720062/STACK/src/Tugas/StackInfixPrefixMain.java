package Tugas;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class StackInfixPrefixMain {
    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        String P, Q, log = "";
        System.out.print("Masukkan ekspresi matematika: ");
        Q = faris.nextLine();
        for (int i = (Q.length() - 1); i >= 0; i--) {
            log = log + Q.charAt(i);
        }
        log = log.trim();
        log = log + "(";

        int total = log.length();

        StackInfixPrefix pref = new StackInfixPrefix(total);
        P = pref.konversi(log);
        System.out.println("Prefix: " + new StringBuffer(P).reverse());
    }

}
