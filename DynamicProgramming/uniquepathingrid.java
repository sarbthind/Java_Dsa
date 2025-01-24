import java.util.*;
public class uniquepathingrid {
    // Simple recursion
    // tc o(2**n*m)
    // sc o(m-1+n-1)
    // public static int allPaths(int[][] grid ,int i,int j){
    //     if(i==0&&j==0) return 1;
    //     if(i<0||j<0) return 0;
    //     int up=allPaths(grid,i-1,j);
    //     int left=allPaths(grid,i,j-1);
    //     return up+left;
    // }
    // public static void main(String[] args) {
    //     int[][] grid={
    //         {1,2,3},
    //         {4,5,6},
    //         {7,8,9}
    //     };
    //     int ans=allPaths(grid,grid.length-1,grid[0].length-1);
    //     System.out.println(ans);
    // }


    // Memoziation
    // TC o(n*m) sc(n-1+m-1+n*m)
    // public static int allPaths(int[][] grid ,int i,int j,int[][] dp){
    //     if(i==0&&j==0) return 1;
    //     if(i<0||j<0) return 0;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     int up=allPaths(grid,i-1,j,dp);
    //     int left=allPaths(grid,i,j-1,dp);
    //     return dp[i][j]=up+left;
    // }
    // public static void main(String[] args) {
    //     int[][] grid={
    //         {1,2,3},
    //         {4,5,6},
    //         {7,8,9}
    //     };
    //     int[][] dp=new int[grid.length][grid[0].length];
    //     for(int[]i:dp) Arrays.fill(i,-1);
    //     int ans=allPaths(grid,grid.length-1,grid[0].length-1,dp);
    //     System.out.println(ans);
    // }
    
    
    
    // Tabulation
    // public static void main(String[] args) {
    //     int[][] grid={
    //         {1,2,3},
    //         {4,5,6},
    //         {7,8,9}
    //     };
    //    int[][] dp=new int[grid.length][grid[0].length];
    //    dp[0][0]=1;
    //    for(int i=0;i<dp.length;i++){
    //        for(int j=0;j<grid[0].length;j++){
    //            if(i==0&&j==0) dp[i][j]=1;
    //            else{
    //                int up=0;
    //                int left=0;
    //             if(i>0) up=dp[i-1][j];
    //             if(j>0) left=dp[i][j-1];
    //             dp[i][j]=up+left;
    //         }
    //     }
    //    }
    //     System.out.println(dp[grid.length-1][grid[0].length-1]);
    // }

    // spaceoptimization
    public static void main(String[] args) {
        int[][] grid={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
       int[] prev=new int[grid.length];  //upper row storing
       for(int i=0;i<grid.length;i++)prev[i]=0;
       for(int i=0;i<grid.length;i++){
        int[] current=new int[grid.length];  //current row stroing
        for(int j=0;j<grid[0].length;j++){
            if(i==0&&j==0) current[j]=1;
    
            else{
                int up=0;
                int left=0;
                if(i>0) up=prev[j];
                if(j>0) left=current[j-1];
                current[j]=up+left;
            }
            
        }
        prev=current;
       }
       System.out.println(prev[grid.length-1]);
    }
}
