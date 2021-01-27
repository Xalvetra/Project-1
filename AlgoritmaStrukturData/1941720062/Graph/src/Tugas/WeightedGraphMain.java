package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
public class WeightedGraphMain {

    public static void main(String[] args) {
        int vertex = 6;
        System.out.println("Tugas No 5 - WeightGraph");
        Graph graph = new Graph(vertex);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 4);
        graph.addEdge(4, 1, 4);
        graph.addEdge(4, 5, 6);
        graph.printGraph();

    }
}
