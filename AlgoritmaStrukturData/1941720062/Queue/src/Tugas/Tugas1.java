/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class Tugas1 {

    int max, size, front, rear;
    int[] q;

    Tugas1(int n) {
        max = n;
        create();
    }

    void create() {
        q = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen Terdepan : " + q[front]);
        } else {
            System.out.println("Antrian Masih Kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terakhir : " + q[rear]);
        } else {
            System.out.println("Elemen Masih kosong");
        }
    }

    public void peekPosition(int data) {
        if (!isEmpty()) {
            for (int i = front; i < max - 1; i++) {
                if (data == q[i]) {
                    System.out.println("Elemen yang dicari berada diposisi : " + data + " berada di posisi " + i);
                } else {

                }
            }
        }
    }

    public void PositionAt(int posisi) {
        if (!isEmpty()) {
            for (int i = front; i < max - 1; i++) {
                if (posisi == i) {
                    System.out.println("Posisi yang dicari bernilai: " + q[posisi] + " berada di posisi " + i);
                    break;
                } else {
                    if (i == max - 1) {
                        System.out.println("Data pada posisi" + posisi + "tidak ditemukan");
                        break;
                    }
                }
            }
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih Kosong!!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(q[i] + "-");
                i = (i + 1) % max;
            }
            System.out.println(q[i] + " ");
            System.out.println("Jumlah Antrian = " + size);
        }
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Antrian Sudah Penuh!!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            q[rear] = data;
            size++;
        }
    }

    int dequeue() {
        int data = 0;
        if (isEmpty()) {
            System.out.println("Antrian Kosong!!");
        } else {
            data = q[front];
            size--;
            if (isEmpty()) {
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
}
