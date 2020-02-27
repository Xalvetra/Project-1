package array2d;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Array2D {

    public static void main(String[] args) {

        int Array[][] = new int[][]{
        {0, 983, 787, 714, 1375, 967, 1087},
        {983, 0, 214, 1102, 1763, 1723, 1842}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; i < 5; j++) {
                System.out.print(Array[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
