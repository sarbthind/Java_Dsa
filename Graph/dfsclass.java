import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class dfsclass {
    public static void helper(List<Integer> dfs,List<List<Integer>> graph,boolean[] visited,int src){
        visited[src]=true;
        dfs.add(src);
        for(int nbr:graph.get(src)){
            if(!visited[nbr]){
            helper(dfs,graph,visited,nbr);
        }
    }

    }
    public static List<Integer> dfs(int[][] edges,int n,int src){
        List<Integer> dfs=new ArrayList<>();
        List<List<Integer>> graph=build(edges,n);
        boolean[] visited=new boolean[n];
        helper(dfs,graph,visited,src);
        return dfs;
    }
    public static List<List<Integer>> build(int[][] edges,int n){
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++){
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
            {1,2},
            {1,3},
            {1,4},
            {2,5},
            {3,4},
            {3,5}
        };
        int src=0;
        List<Integer> dfs=dfs(edges,n,src);
        System.out.print(dfs);
    }
}
