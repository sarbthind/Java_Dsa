import java.util.*;
public class implementationusingmatrix {
    // static List<List<Integer>> l;
    public static void print(int[][] grid){
        int rows=grid.length;
      for(int i=0;i<rows;i++){
          System.out.print(i+": ");
        for(int j=0;j<grid[i].length;j++){
            if(grid[i][j]==1){
                System.out.print(j+" ");
            }
        }
        System.out.println();
      }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        int[][] grid=new int[][]{
            {1,1,1,0,0,0},
            {1,0,1,1,1,0},
            {1,1,0,0,0,1},
            {0,1,0,0,1,1},
            {0,1,0,1,0,0},
            {0,0,1,1,0,0}
        };
        print(grid);
    }
}
