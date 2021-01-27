package Tugas1;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Mahasiswa {

    Node head;
    int size;
    String nim;
    String nama;
    String alamat;

    public Mahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa m) {
        head = new Node(m, head);
        size++;
    }

    public void add(Mahasiswa m, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(m);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(m, next);
        }
        size++;
    }

    public void addLast(Mahasiswa m) {
        if (isEmpty()) {
            addFirst(m);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(m, null);
        }
        size++;
    }

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        return head.mh.nama;
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.mh.nama;
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.mh.nama;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node prev = head;
            Node cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        Mahasiswa mh = new Mahasiswa();
        if (!isEmpty()) {
            System.out.println("Isi data : ");
            Node tmp = head;
            while (tmp != null) {
                System.out.println("NIM\t: " + tmp.mh.nim);
                System.out.println("Nama\t: " + tmp.mh.nama);
                System.out.println("Alamat\t: " + tmp.mh.alamat);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("LinkedLists Kosong");
        }
    }

}