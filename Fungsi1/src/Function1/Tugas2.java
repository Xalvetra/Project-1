package Function1;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukkan Jari-Jari Yang Anda Inginkan : ");
        int jari = faris.nextInt();
    
        System.out.println("Keliling Lingkaran : "+KelilingLingkaran(jari));
        System.out.println("Luas Lingkaran : "+LuasLingkaran(jari));
    }

    static double LuasLingkaran(double n) {
        double phi = 3.14, L;
        L = n * n * phi;
        return(L);
    }

    static double KelilingLingkaran(double n) {
        double phi = 3.14, K;
        K = 2 * n * phi;
        return(K);
    }

}