package testfaris;

/**
 *
 * @author Faris Ikhlasul H
 */
public class TesBigo {

    public static void main(String[] Args) {
        var count = 16;
        for (var i = 1; i < 1000000; i++) {
                for (var k = 1; k < 10500; k = k + 2) {
                    count++;
                    System.out.println(count);
                
            }
        }
    }
}
