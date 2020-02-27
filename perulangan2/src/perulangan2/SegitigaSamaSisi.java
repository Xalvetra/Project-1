package perulangan2;
import java.util.Scanner;
public class SegitigaSamaSisi {

    public static void main(String[] args) {
        Scanner faris = new Scanner(System.in);
        int i, j, k, n;
        
        System.out.print("Masukan Baris Yang Anda Inginkan : ");
        n = faris.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (j * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (j * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (j * 2); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
