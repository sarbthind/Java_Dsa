import java.util.*;
public class Implementationusinglist {

   static List<List<Integer>> graph;
    public static void creategraph(int[][] edges,int n){
        graph=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of vertes");
        int n=sc.nextInt();
        int[][] edges=new int[][]{
            {0,1},
            {0,2},
            {1,2},
            {1,3},
            {1,5},
            {2,4},
            {3,5},
            {4,5}
        };
        creategraph(edges,n);
        for(int i=0;i<n;i++){
            System.out.print(i+": ");
            System.out.println(graph.get(i));
        }
        
    }
}
