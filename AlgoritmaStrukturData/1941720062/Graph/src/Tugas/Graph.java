package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
//import java.util.Scanner;
//import java.util.LinkedList;
public class Graph {

    int vertex;
    LinkedList[] list;
    boolean isDirected = false;
    String[] namaKota;

    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        namaKota = new String[vertex];
        namaKota[0] = "Malang";
        namaKota[1] = "Surabaya";
        namaKota[2] = "Gresik";
        namaKota[3] = "Bandung";
        namaKota[4] = "Jakarta";
        namaKota[5] = "Sidoarjo";

        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination) {
        if (isDirected) {
            list[source].addFirst(destination);
        } else {
            list[source].addFirst(destination);
            list[destination].addFirst(source);
        }

    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.println("Vertex " + namaKota[i] + "  terhubung dengan:  ");
//            LinkedList<Edge> linkedList = list[i];
                for (int j = 0; j < list[i].size(); j++) {
                    for (int k = 0; k < vertex; k++) {
                        if (list[i].get(j) == k) {
//                System.out.print(list[i].get(j) + "  ");
//                }
//                System.out.println("");
                            System.out.println(namaKota[k]+ " ");
                        }
                    }
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public void degree(int source) throws Exception {
        //  degree  undirected  graph
        System.out.println("degree  vertex  " + source + "  :  " + list[source].size());
        //  degree  directed  graph
        //  inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) {
                    ++totalIn;
                }
            }
            //  OutDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + source + ":  " + totalIn);
        System.out.println("Outdegree dari vertex " + source + "  :  " + totalOut);
        System.out.println("degree dari vertex " + source + "  :" + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        if (isDirected) {
            for (int i = 0; i < list[source].size(); i++) {
                if (list[source].get(i) == destination) {
                    list[source].remove(i);
                }
                if (list[source].get(i) == source) {
                    list[destination].remove(i);
                }
            }
        } else {
            for (int i = 0; i < list[source].size(); i++) {
                if (list[source].get(i) == destination) {
                    list[source].remove(i);
                }
                if (list[destination].get(i) == source) {
                    list[destination].remove(i);
                }
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public boolean graphType(int num) {
        switch (num) {
            case 0:
                return false;
            case 1:
                isDirected = true;
                return isDirected;
            default:
                return true;
        }
    }

//    public void degree(int source, int pilih) throws Exception {
//        //  degree  undirected  graph
//        if (graphType(pilih)) {
//            System.out.println("degree vertex " + source + "  :  " + list[source].size()
//            );
//        } else {
//            //  degree  directed  graph
//            //  inDegree
//            int k, totalIn = 0, totalOut = 0;
//            for (int i = 0; i < vertex; i++) {
//                for (int j = 0; j < list[i].size(); j++) {
//                    if (list[i].get(j) == source) {
//                        ++totalIn;
//                    }
//                }
//                //  OutDegree
//                for (k = 0; k < list[source].size(); k++) {
//                    list[source].get(k);
//                }
//                totalOut = k;
//            }
//            System.out.println("Indegree dari vertex  " + source + "  :  "
//                    + totalIn);
//            System.out.println("Outdegree dari vertex  " + source + "  :" + totalOut);
//            System.out.println("degree dari vertex " + source + "  :  " + (totalIn + totalOut));
//        }
//    }
//    public static void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        Graph graph = new Graph(6);
//        System.out.print("Input  Graph  type  (0=directed,  1=undirected):  ");
//        int pill = sc.nextInt();
//        System.out.println(graph.graphType(pill));
////        graph.addEdge(0, 1);
////        graph.addEdge(0, 4);
////        graph.addEdge(1, 2);
////        graph.addEdge(1, 3);
////        graph.addEdge(1, 4);
////        graph.addEdge(2, 3);
////        graph.addEdge(3, 4);
////        graph.addEdge(3, 0);
//        graph.printGraph();
//        graph.degree(2);
//        graph.removeEdge(1, 2);
//        graph.printGraph();
//        String pil;
//        do {
//            System.out.println("Input  :  <source>  <destination>");
//            int source = sc.nextInt();
//            int destination = sc.nextInt();
////            graph.addEdge(source, destination);
//            do {
//                System.out.print("Another  one  (y/n)  :  ");
//                pil = sc.next();
//                if (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n")) {
//                    System.out.println("Input  False");
//                }
//            } while (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n"));
//        } while (pil.equalsIgnoreCase("y"));
//        graph.printGraph();
//    }
}
