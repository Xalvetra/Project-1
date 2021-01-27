package Praktikum;

/**
 *
 * @author Faris Ikhlasul H
 */
public class DoubleLinkedList1Main {

    public static void main(String[] args) {
        DoubleLinkedList1 dll = new DoubleLinkedList1();
        try {
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("==========================");
            dll.addFirst(3);
            dll.addLast(4);
            dll.addFirst(7);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("==========================");
            dll.add(40, 1);
            dll.print();
            System.out.println("Size : " + dll.size());
            System.out.println("==========================");
            dll.clear();
            dll.print();
            System.out.println("Size : " + dll.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
