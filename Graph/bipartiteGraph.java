import java.util.*;
public class bipartiteGraph {
    public static boolean check(int start,int V,ArrayList<ArrayList<Integer>> adj,int[] color){
        Queue<Integer> q=new LinkedList<>();
        color[start]=0;
        q.add(start);
        while(!q.isEmpty()){
            int current=q.poll();
            for(int it:adj.get(current)){
                if(color[it]==-1){
                    color[it]=1-color[current];
                    q.add(it);
                }
                else if(color[it]==color[current]) return false;
            }
        }
        return true;

    }
    public static boolean isBipartite(int V,ArrayList<ArrayList<Integer>> adj){
        int[] color=new int[V];
        for(int i=0;i<V;i++) color[i]=-1;
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(!check(i,V,adj,color)) return false;
            }
        }
        return true;
    }
}
