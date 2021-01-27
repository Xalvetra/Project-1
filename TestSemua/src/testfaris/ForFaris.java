package testfaris;

/**
 *
 * @author Faris Ikhlasul H
 */
public class ForFaris {

    public static void main(String[] Args) {
        int count = 0;
        for (int i = 0; i < 49; i++) {
            for (int j = 1; j < 50 - i; j++) {
                count++;
            }
            System.out.println(count);
        }
    }
}