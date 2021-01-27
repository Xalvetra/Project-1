package Tugas;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USER
 */
public class prefixMain {

    public static void main(String[] args) {
        Scanner izul = new Scanner(System.in);
        String P, Q, eksp = "";
        System.out.println("Masukkan ekspresi matematika: ");
        Q = izul.nextLine();
        for (int i = (Q.length() - 1); i >= 0; i--) {
            eksp = eksp + Q.charAt(i);
        }
        eksp = eksp.trim();
        eksp = eksp + "(";

        int total = eksp.length();

        prefix pref = new prefix(total);
        P = pref.konversi(eksp);
        System.out.println("Prefix: " + new StringBuffer(P).reverse());
    }

}
