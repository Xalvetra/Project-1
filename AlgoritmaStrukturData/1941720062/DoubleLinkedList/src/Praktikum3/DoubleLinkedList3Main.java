package Praktikum3;

/**
 *
 * @author Faris Ikhlasul H
 */
public class DoubleLinkedList3Main {

    public static void main(String[] args) throws Exception {
        DoubleLinkedList3 dll = new DoubleLinkedList3();
        dll.print();
        System.out.println("Size : " + dll.size());

        System.out.println("================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());

        System.out.println("================================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size :" + dll.size());

        System.out.println("================================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size());

        System.out.println("================================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());

        System.out.println("================================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());

        System.out.println("================================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("Size : " + dll.size());

        System.out.println("================================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());

        System.out.println("================================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size :" + dll.size());

        System.out.println("================================================");
        System.out.println("Data awal pada Linked Lits adalah: " + dll.getFirst());
        System.out.println("Data akhir pada Linked Lits adalah: " + dll.getLast());
        System.out.println("Data indeks ke-i pada Linked Lits adalah: " + dll.get(1));
    }
}
