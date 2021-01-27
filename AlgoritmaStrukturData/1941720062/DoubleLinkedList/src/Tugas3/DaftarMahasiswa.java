package Tugas3;

/**
 *
 * @author Faris Ikhlasul H
 */
public class DaftarMahasiswa {

    NodeMahasiswa head;
    int size;

    public DaftarMahasiswa() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int nilai) {
        if (isEmpty()) {
            head = new NodeMahasiswa(null, nama, nilai, null);
        } else {
            NodeMahasiswa newNode = new NodeMahasiswa(null, nama, nilai, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(String nama, int nilai) {
        if (isEmpty()) {
            addFirst(nama, nilai);
        } else {
            NodeMahasiswa current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeMahasiswa newNode = new NodeMahasiswa(current, nama, nilai, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(String nama, int nilai, int index) throws Exception {
        if (isEmpty()) {
            addFirst(nama, nilai);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            NodeMahasiswa current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeMahasiswa newNode = new NodeMahasiswa(null, nama, nilai, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeMahasiswa newNode = new NodeMahasiswa(current.prev, nama, nilai,
                        current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            while (tmp != null) {
                System.out.println("Nama : " + tmp.nama + "\t");
                System.out.println("Nilai : " + tmp.nilai + "\t");
                tmp = tmp.next;
            }
            System.out.println();

        } else {
            System.out.println("Linked lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih Kosong, tidak dapat di hapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked	List	Masih	Kosong,	Tidak	Dapat Dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeMahasiswa current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas!");
        } else if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong!");
        }
        String kata = "";
        kata += "Nama : " + "/nNilai : " + head.nilai;
        return kata;
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong!");
        }
        NodeMahasiswa tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        String kata = "";
        kata += "Nama : " + "/nNilai : " + head.nilai;
        return kata;
    }

    public String get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Linked List kosong!");
        }
        NodeMahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        String kata = "";
        kata += "Nama : " + "/nNilai : " + head.nilai;
        return kata;
    }

    public void search(String nama, int n1) {
        int i = 0;
        NodeMahasiswa tmp = head;
        while (tmp != null) {
            if (tmp.nama.equals("") == nama.equals("") && tmp.nilai == n1) {
                System.out.println("Nama : " + tmp.nama + "\nData Nilai : " + tmp.nilai + "\nBerada Pada Indeks Ke : " + i);
                break;
            }
            i++;
            tmp = tmp.next;
        }
    }

    public void Urut() {
        int swapped;
        NodeMahasiswa cur;
        if (isEmpty()) {
            System.out.println("LinkedList dalam keadaan kosong");
        } else {
            do {
                swapped = 0;
                cur = head;
                while (cur.next != null) {
                    if (cur.nilai < cur.next.nilai) {
                        int tempNilai = cur.next.nilai;
                        String tempNama = cur.next.nama;
                        cur.next.nama = cur.nama;
                        cur.next.nilai = cur.nilai;
                        cur.nama = tempNama;
                        cur.nilai = tempNilai;
                        swapped = 1;
                    }
                    cur = cur.next;
                }

            } while (swapped == 1);
        }
    }
}
