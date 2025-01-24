public class khansAlgorithm {

    // what we are doing is topological sorting using bfs traversal graph is directed acyclic 
    // we can do it using dfs trversal using stack 
    // first we create an arry from adj list that indicate the indegree of the vertices then we add those vertices to queue whose 
    // degree is 0 then we traverse the graph and add those element to queue which are directed connected to already added vertices and 
    // decrease its count in array first we add those whose degree is one -1=0 the if we encounter a vertices of degree more than one 
    // we decraese it from one but we donot add it to the queue
    public static void main(String[] args) {
        
    }
}
