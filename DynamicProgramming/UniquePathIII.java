public class UniquePathIII {
    // this question gives total path visiting all nodes in matrix from bottomright to topleft
    public static int totalWays(int[][] grid,int i,int j,boolean[][] visited,int nodes,int totalnodes){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length) return 0;
        if(visited[i][j]) return 0;
        if(i==0&&j==0&&nodes==totalnodes) return 1;
        visited[i][j]=true;
        int up=totalWays(grid, i-1, j,visited,nodes+1,totalnodes);
        int down=totalWays(grid, i+1, j,visited,nodes+1,totalnodes);
        int left=totalWays(grid, i, j-1,visited,nodes+1,totalnodes);
        int right=totalWays(grid, i, j+1,visited,nodes+1,totalnodes);
        visited[i][j]=false;
        return up+down+left+right;
    }
    public static void main(String[] args) {
        int[][] grid={
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
        };
        
        int n=grid.length-1;
        int m=grid[0].length-1;
        int totalnodes=grid.length*grid[0].length;
        boolean[][] visited=new boolean[n+1][m+1];
        int ans=totalWays(grid,n,m,visited,1,totalnodes);
        System.out.println(ans);
    }
}
