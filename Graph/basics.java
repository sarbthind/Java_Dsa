import java.util.*;

class Graph {
    private  Map<Integer, List<Integer>> adj=new HashMap<>();
    public   void addEdge(int u, int v, boolean direction) {
        // direction = false for undirected
        // direction = true for directed
        adj.putIfAbsent(u, new ArrayList<>());
        adj.get(u).add(v);
        
        if (direction==false) {
            adj.putIfAbsent(v, new ArrayList<>());
            adj.get(v).add(u);
        }
    }
    
    public  void printAdjList() {
        for (Map.Entry<Integer, List<Integer>> hm : adj.entrySet()) {
            System.out.print(hm.getKey() + " -> ");
            for (Integer i: hm.getValue()) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
    }
}
class basic{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the number of edges: ");
        int m = scanner.nextInt();
        
        Graph g = new Graph();
        System.out.println("Enter " + m + " edges (u v format):");
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            g.addEdge(u, v, false);
        }
        
        g.printAdjList();
        scanner.close();
    }
}

