package Praktikum;

/**
 *
 * @author Faris Ikhlasul H
 */
public class LinkedLists {

    Node head;
    int size;
    int search;
    public LinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        head = new Node(item, head);
        size++;
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        }
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
        }
        size++;
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedLists kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
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
        }
        size--;
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
        if (!isEmpty()) {

            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void addByValue(int search, int n) throws Exception {
        if (!isEmpty()) {
            boolean cek = false;
            Node temp = head;
            while (temp != null) {
                if (temp.data == search) {
                    cek = true;
                    break;
                }
                temp = temp.next;
            }
            if (cek) {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new Node(n, null);
                size++;
            } else {
                throw new Exception("Data Yang Dicara Tidak Ada");
            }
        }
    }

    public void removeByValue(int data) throws Exception {
        Node Back = head;
        Node forward = head.next;
        for (int i = 1; i < size; i++) {
            if (data != Back.data) {
                Back = Back;
                forward = Back.next;
            }
        }
        Back.next = forward.next;
        size--;
    }

    public void cariidx(int m) throws Exception {
        if (isEmpty()) {
            System.out.println("Kosong");
        } else {
            System.out.println("Hasil Pencarian Data :");
        }
        if (search == m) {
            System.out.println("Ditemukan di indeks -"+search);
        }
    }

    public void carikey(int item) {
        if (item == size) {
            System.out.println("Ditemukan");
        }
    }
}
