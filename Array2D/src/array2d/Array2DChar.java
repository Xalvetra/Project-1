package array2d;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Array2DChar {

    public static void main(String[] args) {
        int x = 5;
        int i, j, k, l, m;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = x; k >= j; k--) {
                System.out.print("*");
            }
            for (l = 1; l <= x; l++) {
                System.out.print("9");

            }
            for (m = x; m >= j; m--
                    ) {
                System.out.print("$");

            }
            System.out.println();
        }
    }
}
