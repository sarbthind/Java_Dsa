import java.util.*;

public class bfstraversalclass {
    public static void addedges(ArrayList<ArrayList<Integer>> adj, int i, int j) {
        adj.get(i).add(j);
        adj.get(j).add(i);
    }
    
    public static int[] bfs(ArrayList<ArrayList<Integer>> graph, int src, int n) {
        int[] ans = new int[n];
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(src);
        visited[src] = true;
        int i = 0;
        
        while (!q.isEmpty()) {
            int current = q.poll();
            ans[i] = current;
            i++;
            
            for (int neighbour : graph.get(current)) {
                if (!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        // Initialize adjacency list
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        int[][] edges = new int[][] {
            {0, 1},
            {0, 2},
            {1, 2},
            {1, 3},
            {4, 5}
        };
        
        // Add edges to the graph
        for (int[] edge : edges) {
            if (edge.length == 2) {
                addedges(adj, edge[0], edge[1]);
            }
        }
        
        // Perform BFS from source vertex 0
        int[] bfsResult = bfs(adj, 0, n);
        
        // Print BFS traversal
        System.out.println("BFS Traversal:");
        for (int vertex : bfsResult) {
            System.out.print(vertex + " ");
        }
    }
}