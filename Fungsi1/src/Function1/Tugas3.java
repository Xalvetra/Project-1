package Function1;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Tugas3 {

    static int[] Seleksi() {
        

        int[] array = new int[10];
        array[0] = 1;
        for (int i = 2; i < array.length; i += 2) {
            array[i] = array[i - 2] + 1;
        }
        return(array);

    }
    

    public static void main(String[] Args) {
        for (int i : Seleksi()){
            System.out.print(i);
        }
    }
}
