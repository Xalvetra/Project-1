package Tugas2;

/**
 *
 * @author Faris Ikhlasul H
 */
public class LinkedListNsb {

    Node head;
    int size;

    public LinkedListNsb() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Nasabah nsb) {
        head = new Node(nsb, head);
        size++;
    }

    public void add(Nasabah nsb, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(nsb);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(nsb, next);
        }
        size++;
    }

    public void addLast(Nasabah nsb) {
        if (isEmpty()) {
            addFirst(nsb);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(nsb, null);
        }
        size++;
    }

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        return head.nsb.nama;
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.nsb.nama;
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.nsb.nama;
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
        Nasabah nsb = new Nasabah();
        if (!isEmpty()) {
            System.out.println("Isi data : ");
            Node tmp = head;
            while (tmp != null) {
                System.out.println("No.Rekening	: " + tmp.nsb.norek);
                System.out.println("Nama	: " + tmp.nsb.nama);
                System.out.println("Alamat	: "+tmp.nsb.alamat);
tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("LinkedLists Kosong");
        }
    }
}
