package perulangan2;

/**
 * @author Faris Ikhlasul H
 */
import java.util.Scanner;

public class SquareFaris {

    public static void main(String[] Args) {
        Scanner faris = new Scanner(System.in);

        int N,i;

        System.out.print("Masukan Nilai N = ");
        N = faris.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (i = 1; i <= iOuter; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
