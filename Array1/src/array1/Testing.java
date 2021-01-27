package array1;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Testing {

    public static void main(String[] args) {
        String[] data = {"a", "b", "c"};
        String delete = "b";
        String[] newData = new String[data.length - 1];
        int index = 0;
        for (int c = 0; c < data.length; c++) {
            if (data[c].equals(delete)) {
                index = c;
                break;
            }
        }
        for (int x = 0; x < index; x++) {
            newData[x] = data[x];
        }
        for (int y = index + 1; y < data.length; y++) {
            newData[y - 1] = data[y];
        }
        for (int z = 0; z < newData.length; z++) {
            System.out.println(newData[z]);
        }
    }
}
