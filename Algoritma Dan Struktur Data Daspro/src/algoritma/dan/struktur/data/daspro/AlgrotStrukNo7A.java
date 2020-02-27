package algoritma.dan.struktur.data.daspro;

/**
 *
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class AlgrotStrukNo7A {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);
        int k = 0, deret;
        System.out.print("Banyak Deret Fibonacci : ");
        deret = faris.nextInt();
        System.out.print("Hasil : ");
        fiboNacci(deret);

    }

    static void fiboNacci(int deret) {
        int x =0 , y=1;
        for(int i = 0 ; i<deret ; i++){
            System.out.print(x+ " ");
            x=x+y;
            y=x-y;
        }
    }
}