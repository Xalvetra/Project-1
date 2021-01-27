package Praktikum;

/**
 *
 * @author Faris Ikhlasul H
 */
public class BinaryTreeArray {

    int data[], idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    public void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + "  ");
            traverseOrder(2 * idxStart + 2);
        }
    }
}