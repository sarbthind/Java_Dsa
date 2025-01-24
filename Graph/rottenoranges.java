import java.util.LinkedList;

public class rottenoranges {
    public static Node{
        int i,int j;
    }
   static  int[][] direction=new int[][]{
        {-1,0},
        {0,-1},
        {0,1},
        {1,0}
    };
    public int orangesrotting(int[][] grid){
        int rows=grid.length;
        int cols=grid[0].length;
        int min=0;
        Queue<Node> q=new LinkedList<>();




        while(!q.isEmpty()){
            Node current=q.poll();
            for(int[] dir:direction){
                int new_i=current.i+dir[0];
                int new_j=current.j+dir[1];
                if(isvalid(new_i,new_j,rows,cols)&&grid[new_i][new_j]==1){
                    q.offer(new Node(new_i,new_j,current.time+1));
                    grid[new_i][new_j]=2;
                    min=curr.time+1;
                }
            }

        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[rows][cols]==1){
                    return -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
