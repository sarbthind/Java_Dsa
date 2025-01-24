public class uniquepathingrid2MazeObstacle {
    // public static int allPaths(int[][] grid ,int i,int j){
    //     if(i>=0&&j>=0&&grid[i][j]==-1) return 0;
    //            if(i==0&&j==0) return 1;
    //         if(i<0||j<0) return 0;

    //         int up=(allPaths(grid,i-1,j));

    //         int left=(allPaths(grid,i,j-1));
    //         return up+left;
    //     }
    //     public static void main(String[] args) {
    //         int[][] grid={
    //             {0,0,0},
    //             {0,-1,0},
    //             {0,0,0}
    //         };
    //         int ans=allPaths(grid,grid.length-1,grid[0].length-1);
    //         System.out.println(ans);
    //     }


    // Tabulation
    public static void main(String[] args) {
        int[][] grid={
            {0,0,0},
            {-1,0,0},
            {0,0,0}
        };
        int[][] dp=new int[grid.length][grid[0].length];
        dp[0][0]=1;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                // if(grid[i][j]==-1) dp[i][j]=0;
                 if(i==0&&j==0) dp[i][j]=1;
                else{
                    int up=0;
                    int left=0;
                    if(i>0&&grid[i][j]!=-1) up=dp[i-1][j];
                    if(j>0&&grid[i][j]!=-1) left=dp[i][j-1];
                    dp[i][j]=up+left;
                }
            
            }
            
        }
        System.out.println(dp[grid.length-1][grid[0].length-1]);
    }
}
