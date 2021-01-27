package Tugas1;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Node<T> {

    Mahasiswa mh = new Mahasiswa();
    Node<T> next;

    public Node(Mahasiswa mh, Node<T> next) {
        this.mh = mh;
        this.next = next;
    }
}
