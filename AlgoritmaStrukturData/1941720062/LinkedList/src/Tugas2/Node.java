package Tugas2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Node<T> {

    Nasabah nsb = new Nasabah();
    Node<T> next;

    public Node(Nasabah nsb, Node<T> next) {
        this.nsb = nsb;
        this.next = next;
    }
}
