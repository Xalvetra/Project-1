package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class StackOpposite {
        int size, top;
        String data[];
        StackOpposite(int size) {
            this.size = size;
            data = new String[size];
            top = -1;
        }
        public boolean IsEmpty() {
            if (top == -1) {
                return true;
            } else {
                return false;
            }
        }
        public boolean IsFull() {
            if (top == size - 1) {
                return true;
            } else {
                return false;
            }
        }
        public void Push(String dt) {
            if (!IsFull()) {
                top++;
                data[top] = dt;
            } else {
                System.out.println("Data Penuh");
            }
        }
        public void Pop() {
            if (!IsEmpty()) {
                String x = data[top];
                top--;
                System.out.println("Data yang keluar " + x);
            } else {
                System.out.println("Stack Masih kosong");
            }
        }
        public void peek() {
            System.out.println("Elemen Teratas: " + data[top]);
        }
        public void tampil() {
            System.out.print("Kalimat dibalik: ");

            for (int i = data.length - 1; i >= 0; i--) {
                System.out.print(data[i] + " ");
            }
        }
    }