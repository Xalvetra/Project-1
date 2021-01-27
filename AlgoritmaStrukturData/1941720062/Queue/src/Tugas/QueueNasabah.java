package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class QueueNasabah {

    int max, front, rear, size;
    Nasabah q[];

    QueueNasabah() {
    }

    public QueueNasabah(int max) {
        this.max = max;
        Create();
    }

    public void Create() {
        q = new Nasabah[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Nasabah n) {
        if (IsFull()) {
            System.out.println("Antrian Penuh !! ");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            q[rear] = n;
            size++;
        }
    }

    public Nasabah Dequeue() {
        Nasabah data = null;
        if (IsEmpty()) {
            System.out.println("Antrian Kosong !! ");
        } else {
            data = q[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;

                }
            }
        }
        return data;
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Maaf Antrian Masih Kosong !! ");
        } else {
            int i = front;
            while (i != rear) {
                q[i].print();
                i = (i + 1) % max;
            }
            q[i].print();
            System.out.println("Jumlah Antrian Nasabah : " + size);
        }
    }

    public void peek() {
        if (IsEmpty()) {
            System.out.println("Antrian Masih Kosong !! ");
        } else {
            System.out.println("Nasabah Terdepan : ");
            q[front].print();
        }
    }

    public void peekRear() {
        if (IsEmpty()) {
            System.out.println("Antrian Masih Kosong !! ");
        } else {
            System.out.println("Nasabah Terbelakang : ");
            q[rear].print();
        }
    }

    public void peekPosition(Nasabah nas) {
        if (IsEmpty()) {
            System.out.println("Antrian Masih Kosong !! ");
        } else {
            for (int j = front; j < max - 1; j++) {
                if (nas == q[j]) {
                    System.out.print("Nasabah ");
                    q[j].print();
                    System.out.println("Berada Pada Antrian Ke-" + j);
                    break;

                } else {
                    if (j == max - 1) {
                        System.out.println("Data Tidak Ditemukan");
                    }
                }
            }
        }
    }

    public void printNasabah(int posisi) {
        if (IsEmpty()) {
            System.out.println("Antrian Masih Kosong !! ");
        } else {
            for (int j = front; j < max - 1; j++) {
                if (posisi == j) {
                    System.out.println("Nasabah pada posisi " + j + " Berisi Data Nasabah ");
                    q[j].print();
                    break;
                } else {
                    if (j == max - 1) {
                        System.out.println("Data tidak ditemukan");
                    }
                }
            }
        }
    }
}
