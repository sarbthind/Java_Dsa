import java.util.ArrayList;
import java.util.Queue;
import java.util.*;



public class detectcycleingraph {
    public static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static boolean checkforcycle(int src,int V,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[src]=true;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(src,-1));
        while(!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;
            q.remove();

            for(int adjacentNode:adj.get(node)){
                if(vis[adjacentNode]==false){
                    vis[adjacentNode]=true;
                    q.add(new Pair(adjacentNode,node));
                }
                else if(parent!=adjacentNode){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V,ArrayList<ArrayList<Integer>>adj){
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++) vis[i]=false;
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(checkforcycle(i, V, adj, vis)) return true;
            }
        }
        return false;
    }
}
