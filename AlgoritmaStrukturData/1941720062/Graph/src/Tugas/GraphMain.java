package Tugas;

/**
 *
 * @author Faris Ikhlasul H
 */
//import java.util.Scanner;
public class GraphMain {

//    static Scanner sc = new Scanner(System.in);
    static int pil, type;
    static boolean tipe = true;
    static Graph graph = new Graph(6);

    public static void main(String[] args) throws Exception {
        System.out.println(" ------- Tugas 6 ------- ");
        graph.graphType(1);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 1);
        graph.addEdge(3, 5);
        graph.addEdge(4, 2);
        graph.addEdge(5, 0);
        graph.printGraph();
//        while (true) {
//            menu();
//        }
    }

//    public static void menu() throws Exception {
//        System.out.println("Menu");
//        System.out.println("=======================");
//        System.out.println("1.  Jenis  Graph");
//        System.out.println("2.  Input  jumlah  vertex");
//        System.out.println("3.  AddEdge");
//        System.out.println("4.  RemoveEdges");
//        System.out.println("5.  RemoveAlledges");
//        System.out.println("6.  Exit");
//        System.out.println("=======================");
//        System.out.print("Masukkan  pilihan  :  ");
//
//        pil = sc.nextInt();
//        switch (pil) {
//            case 1:
//                if (tipe == true) {
//                    System.out.print("Input  Graph  type  (0=directed,  1=undirected):  ");
//                    type = sc.nextInt();
//                    System.out.println(graph.graphType(type));
//                    tipe = false;
//                } else {
//                    System.out.println(graph.graphType(type));
//                }
//                break;
//            case 2:
//                System.out.print("Input  :  ");
//                int input = sc.nextInt();
//                graph = new Graph(input);
//                break;
//            case 3:
//                String pil;
//                do {
//                    System.out.println("Input  :  <source>  <destination>");
//                    int source = sc.nextInt();
//                    int destination = sc.nextInt();
////                    graph.addEdge(source, destination);
//                    do {
//                        System.out.print("Another  one  (y/n):  ");
//                        pil = sc.next();
//                        if (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n")) {
//                            System.out.println("Input  False");
//                        }
//                    } while (!pil.equalsIgnoreCase("y") && !pil.equalsIgnoreCase("n"));
//                } while (pil.equalsIgnoreCase("y"));
//                graph.printGraph();
//                break;
//            case 4:
//                System.out.print("Remove  <source>  <destination>  :  ");
//                int source = sc.nextInt();
//                int destination = sc.nextInt();
////                graph.removeEdge(source, destination);
//                break;
//            case 5:
//                graph.removeAllEdges();
//                break;
//            case 6:
//                System.exit(0);
//        }
//    }
}
