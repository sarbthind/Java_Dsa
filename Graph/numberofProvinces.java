import java.util.*;
public class numberofProvinces {
    public static void findprovinces(List<List<Integer>> adj,int src){
        int n =adj.size();
        Queue<Integer> q=new LinkedList<>();
       // List<Integer> l=new LinkedList<>();

        boolean[] visited=new boolean[n];

        visited[src]=true;
        q.add(src);
        while (!q.isEmpty()) {
            int current=q.poll();
            for(int neighbour:adj.get(current)){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }


    }
    public static List<List<Integer>> creategraph(int[][] graph){
        int n=graph.length;
        List<List<Integer>> adj=new ArrayList<>(n);
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(graph[i][j]==1){
                    adj.get(i).add(j);
                    

                }
            }
        }
        return adj;
    }
    public static void main(String[] args) {
        int[][] arr=new int[][]{
            {1,0,1},
            {0,1,0},
            {0,0,1}           
        };
      List<List<Integer>> adj=  creategraph(arr);
      System.out.println(adj);
      int count=0;
      for(int i=0;i<adj.size();i++){

          count++;
          findprovinces(adj,i);
        }
        System.out.println(count);
    }
}
