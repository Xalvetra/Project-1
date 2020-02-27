package array2d;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Arr4 {

    public static void main(String[] Args) {

        int RGB[][][] = {
            {
                {2, 2, 3},
                {5, 6, 7}
            },
            {
                {6, 8, 5},
                {5, 2}
            }
        };

        for (int array2D[][] : RGB) {
            for (int array1D[] : array2D) {
                for (int x : array1D) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
