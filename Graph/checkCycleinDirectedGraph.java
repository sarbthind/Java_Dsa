import java.util.*;
public class checkCycleinDirectedGraph {
    public static  boolean checkdfs(int src,boolean[] path,boolean[] visited,List<List<Integer>> adj){
        visited[src]=true;
        path[src]=true;
        for(int it:adj.get(src)){
            if(!visited[it]){
                if(checkdfs(it, path, visited, adj)==true) return true;
            }
            else if(path[it]==true) return true;
        }
        path[src]=false;
        return false;
    }
    public static boolean isCycle(int V,List<List<Integer>> adj){
        boolean[] path=new boolean[V];
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            path[i]=false;
            visited[i]=false;
        }
        int count=0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(checkdfs(i,path,visited,adj)==true){
                    count++;
                    System.out.println(count);
                    return true;
                }

            }
        }
        return false;

    }
    public static void adjacencyList(int a, int b,List<List<Integer>> adj) {  
     adj.get(a).add(b);   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int E=sc.nextInt();
        int V=sc.nextInt();
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<E;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            adjacencyList(a,b,adj);

        }    
       boolean ans= isCycle(V,adj);
       if(ans==true){
        System.out.println("cycle is present");
       } 
       else{
        System.out.println("Cycle is absent");
       }
    }
}

