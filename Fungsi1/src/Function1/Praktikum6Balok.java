package Function1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Praktikum6Balok {

    public static void main(String[] args) {
        
        int p,l,t,L,vol;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang: " +L);

        vol = hitungVolume(p,l,t);
        System.out.println("Volume Balok adalah: " + vol);
    }

    static int hitungLuas(int p, int l) {
        int Luas = p*l;
        return Luas;
    }

    static int hitungVolume(int p, int l, int t) {
        int volume = p * l * t;
        return volume;
    }
}