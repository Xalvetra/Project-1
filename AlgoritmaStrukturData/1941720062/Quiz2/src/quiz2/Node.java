package quiz2;

/**
 *
 * @author Faris Ikhlasul H
 * @param <T>
 */
public class Node<T> {

    DrWatsonQueue data = new DrWatsonQueue();
    Node<T> next;

    Node(DrWatsonQueue data, Node next) {
        this.data = data;
        this.next = next;
    }
}