package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Faris Ikhlasul H
 */
public class PostfixMain {
   public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika: ");
        Q = faris.nextLine();
        Q = Q.trim();
        Q = Q+")";
        
        int total = Q.length();
        
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix: "+P);
    } 
}
