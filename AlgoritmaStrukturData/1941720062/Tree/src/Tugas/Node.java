package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Node {

    int data;
    Node left, right;

    Node() {

    }

    Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}