import java.util.*;
public class bsfTraversal {
     // BFS for connected graph
     public static List<Integer> bfsConnected(int V, List<List<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        Map<Integer, Boolean> isVisited = new HashMap<>();
        
        // Initialize all vertices as not visited
        for(int i = 0; i < V; i++) {
            isVisited.put(i, false);
        }
        
        // Start BFS from vertex 0
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        isVisited.put(0, true);
        
        while(!queue.isEmpty()) {
            int vertex = queue.poll();
            bfs.add(vertex);
            
            // Add all unvisited neighbors to queue
            for(int neighbor : adj.get(vertex)) {
                if(!isVisited.getOrDefault(neighbor, false)) {
                    queue.add(neighbor);
                    isVisited.put(neighbor, true);
                }
            }
        }
        
        return bfs;
    }
    public static List<List<Integer>> bfsDisconnected(int V, List<List<Integer>> adj) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Boolean> isVisited = new HashMap<>();
        
        // Initialize all vertices as not visited
        for(int i = 0; i < V; i++) {
            isVisited.put(i, false);
        }
        
        // Check each vertex
        for(int i = 0; i < V; i++) {
            // If vertex is not visited, start a new BFS from this vertex
            if(!isVisited.get(i)) {
                List<Integer> componentBfs = new ArrayList<>();
                Queue<Integer> queue = new LinkedList<>();
                
                queue.add(i);
                isVisited.put(i, true);
                
                while(!queue.isEmpty()) {
                    int vertex = queue.poll();
                    componentBfs.add(vertex);
                    
                    // Add all unvisited neighbors to queue
                    for(int neighbor : adj.get(vertex)) {
                        if(!isVisited.getOrDefault(neighbor, false)) {
                            queue.add(neighbor);
                            isVisited.put(neighbor, true);
                        }
                    }
                }
                
                result.add(componentBfs);
            }
        }
        
        return result;
    }

public static void main(String[] args) {
        
        // Example usage:
        int V = 6; // number of vertices
        List<List<Integer>> adj = new ArrayList<>();
// Initialize adjacency list
for(int i = 0; i < V; i++) {
    adj.add(new ArrayList<>());
}

// Add edges (example: undirected graph)
adj.get(0).add(1);
adj.get(1).add(0);
adj.get(0).add(2);
adj.get(2).add(0);
adj.get(1).add(2);
adj.get(2).add(1);
adj.get(1).add(3);
adj.get(3).add(1);
adj.get(1).add(5);
adj.get(5).add(1);
adj.get(2).add(4);
adj.get(4).add(2);
adj.get(3).add(5);
adj.get(5).add(3);
adj.get(4).add(5);
adj.get(5).add(4);

// bsfTraversal sol = new bsfTraversal();
// agar bfsConnected sttaic funtion nhi hai to hmme class ka object bna k call krani pdegi like bfsTraversal sol object bna rakha hai ye sol.bfsConnected call kar de ge bas

// For connected graph
List<Integer> bfsResult = bfsConnected(V, adj);
System.out.println("Connected BFS: " + bfsResult);

// For disconnected graph
// List<List<Integer>> disconnectedResult = sol.bfsDisconnected(V, adj);
// System.out.println("Disconnected BFS components: " + disconnectedResult);
}
}



