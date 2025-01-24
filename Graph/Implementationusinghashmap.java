import java.util.*;
public class Implementationusinghashmap {
    static Map<String,List<String>> graph;
    static void create(String[][] edges){
        graph=new HashMap<>();
        for(String[] edge:edges){
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[1]).add(edge[0]);
        }
        print(graph);

    }
    static void print(Map<String,List<String>> graph){
        for(Map.Entry<String,List<String>> hm:graph.entrySet()){
            System.out.print(hm.getKey()+": ");
            // for(String i:hm.getValue()){
            //     System.out.print(i+" ");
            // }
            System.out.print(hm.getValue());7
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String[][] edges=new String[][]{
            {"B","M"},
            {"B","J"},
            {"B","R"},
            {"R","C"},
            {"M","C"},
            {"J","R"}

        };
        create(edges);
    }
}
