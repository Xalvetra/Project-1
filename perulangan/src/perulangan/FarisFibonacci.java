package perulangan;
import java.util.Scanner;
public class FarisFibonacci {

    public static void main(String[] Args) {
        int x = 0;
        int y = 1;
        int hasil = 0;
        int angka;
        Scanner faris = new Scanner(System.in);
        System.out.print("Masukan Angka Fibonacci Ke- ");
        angka = faris.nextInt();
        for (int i = 1; i <= angka; i++) {
            x = y;
            y = hasil;
            
            System.out.println(x+"+"+y+"=" +hasil);
            hasil = x+y;
        }
    }
}


