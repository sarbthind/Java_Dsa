import java.util.*;
public class bfsstriver {
    public static List<Integer> bfs(List<List<Integer>> adj,int n,int src){
        List<Integer> l=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] arr=new boolean[n];
        q.add(src);
        arr[src]=true;
        while(!q.isEmpty()){
            int current=q.poll();
            l.add(current);
            for(int i:adj.get(current)){
                if(!arr[i]){
                    arr[i]=true;
                    q.add(i);
                }
            }
        }
        return l;

    }
    public static List<List<Integer>> creategraph(int[][] edges,int n){
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int[]edge:edges){
            l.get(edge[0]).add(edge[1]);
            l.get(edge[1]).add(edge[0]);
        }
        return l;
    }
    public static void main(String[] args) {
        int n=6;
        int[][] edges=new int[][]{
            {0,1},
            {0,2},
            {1,2},
            {1,3},
            {1,4},
            {2,5},
            {3,4},
            {3,5}
        };
        int src=0;
      List<List<Integer>> adj= creategraph(edges,n);
        List<Integer> bfs=bfs(adj,n,src);
        System.out.print(bfs);
    }
}
