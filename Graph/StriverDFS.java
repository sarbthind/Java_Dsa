import java.util.*;
public class StriverDFS {
    public static void dfs(int src,boolean[] vis,List<List<Integer>> adj,List<Integer> l){
        vis[src]=true;
        l.add(src);
        for(int it:adj.get(src)){
            if(!vis[it]){
              
                dfs(it,vis,adj,l);
            }
        }
    }
    public static List<Integer> dfsofgraph(List<List<Integer>> adj,int V,int src){
        boolean[] visited=new boolean[V];
        // visited[0]=true;
        List<Integer> l=new ArrayList<>();
        dfs(0,visited,adj,l);
        return l;
    }
    public static List<List<Integer>> creategraph(int[][] edges,int V){
        List<List<Integer>> graph=new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
            
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);

        }
        return graph;
    }
    public static void main(String[] args) {
        int n=6;
        int[][] edges=new int[][]{
            {0,1},
            {0,2},
            {1,100},
            {1,3},
            {1,4},
            {2,5},
            {3,4},
            {3,5}
        };
        int src=0;
      List<List<Integer>> adj= creategraph(edges,n);
        List<Integer> dfs=dfsofgraph(adj,n,src);
        System.out.print(dfs);
    }
}

// Space complexity =o(n)+o(n)+o(n)~o(n)   ----> no. of nodes,recursive stack ,and for visited;
// Time complexity function dfs runnign for each node so it has o(n)+the for loop for each adjacency list is summation of degree of each node
// And summation of each node is 2*E e is no of edges so it is o(n)+(2*E);
