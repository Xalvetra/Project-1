package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class StackKalimat {

    int size;
    int top;
    String nama[];

    public StackKalimat(int size) {
        this.size = size;
        nama = new String[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == - 1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void push(String dt) {
        if (!isFull()) {
            top++;
            this.nama[top] = dt;
        } else {
            System.out.println("Isi Stack Penuh !");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            String x = nama[top];
            top--;
            System.out.println("Data Yang Keluar : " + nama[top]);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        System.out.println("Elemen Teratas : " + nama[top]);
    }

    public void print() {
        System.out.println("Daftar Mahasiswa : ");
        for (int i = top; i >= 0; i--) {
            System.out.println(nama[i] + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack Sudah Dikosongkan");
        } else {
            System.out.println("Gagal! Stack masih kosong");
        }
    }
}
