package Praktikum2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Node {

    int data;
    Node prev;
    Node next;

    public Node(Node prev, int data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
