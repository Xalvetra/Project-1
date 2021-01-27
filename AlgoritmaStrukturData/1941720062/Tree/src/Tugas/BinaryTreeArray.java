package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class BinaryTreeArray {

    int data[], idxLast, i = 0;

    public BinaryTreeArray() {
        data = new int[10];
    }

    public void add(int angka) {
        data[i] = angka;
        i++;
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

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + "  ");
            traverseOrder(2 * idxStart + 1);
            traverseOrder(2 * idxStart + 2);
        }
    }

    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseOrder(2 * idxStart + 1);
            traverseOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + "  ");
        }
    }
}
