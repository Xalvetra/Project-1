package Tugas3;

/**
 *
 * @author Faris Ikhlasul H
 */
public class NodeMahasiswa {

    int nilai;
    String nama;
    NodeMahasiswa prev, next;

    public NodeMahasiswa(NodeMahasiswa prev, String nama, int nilai, NodeMahasiswa next) {
        this.prev = prev;
        this.next = next;
        this.nama = nama;
        this.nilai = nilai;
    }
}