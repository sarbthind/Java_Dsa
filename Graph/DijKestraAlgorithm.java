import java.util.*;
public class DijKestraAlgorithm {
    static class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
   public static  ArrayList<Integer> Dijkestra(ArrayList<ArrayList<Pair>> adj,int src){
    int n=adj.size();
    ArrayList<Integer> dist=new ArrayList<>(Collections.nCopies(n,Integer.MAX_VALUE));
    dist.set(src,0);
    PriorityQueue<Pair> pq=new PriorityQueue<>();
    pq.offer(new Pair(src,0));
    while(!pq.isEmpty()){
        Pair node=pq.poll();
        int current=node.first;
      //  int weight=node.second;
        for(Pair nbr:adj.get(current)){
            if(dist.get(nbr.first)>(dist.get(current)+nbr.second)){
                dist.set(nbr.first)=(dist.get(current)+nbr.second);
                pq.offer(new Pair(nbr.first,dist.get(nbr.first)));
            }
        }
    }
    return dist;

    }
}
