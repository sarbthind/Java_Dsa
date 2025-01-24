import java.util.Arrays;

public class UniquePathIV {
    public static int totalways(int[][] grid,int sr,int sc,int dr,int dc,boolean[][] visited,int nodes,int blocks,int[][][] dp){
        if(sr<0||sc<0||sr>=grid.length||sc>=grid[0].length) return 0;
        if(visited[sr][sc]||grid[sr][sc]==-1) return 0;
        if(sr==dr&&sc==dc&&nodes==((grid.length*grid[0].length)-blocks)) return 1;
        if(dp[sr][sc][nodes]!=-2) return dp[sr][sc][nodes];
        visited[sr][sc]=true;
        int up=totalways(grid,sr-1,sc,dr,dc,visited,nodes+1,blocks,dp);
        int down=totalways(grid,sr+1,sc,dr,dc,visited,nodes+1,blocks,dp);
        int left=totalways(grid,sr,sc-1,dr,dc,visited,nodes+1,blocks,dp);
        int right=totalways(grid,sr,sc+1,dr,dc,visited,nodes+1,blocks,dp);
        visited[sr][sc]=false;
        dp[sr][sc][nodes]=up+down+left+right;
        return dp[sr][sc][nodes];
    }
    public static void main(String[] args) {
        int[][] grid={
           {1,0,0,0},
           {0,0,0,0},
           {0,0,2,-1}
        };
        
        int desrow=0;
        int descol=0;
        int srow=0;
        int scol=0;
        int countblocknode=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    desrow=i;
                    descol=j;
                }
                if(grid[i][j]==2){
                    srow=i;
                    scol=j;
                }
                if(grid[i][j]==-1){
                    countblocknode++;
                }
                
            }
        }
        int n=grid.length;
        int m=grid[0].length;
        int[][][] dp=new int[grid.length][grid[0].length][(grid.length*grid[0].length)-countblocknode+1];
        for(int[][] i:dp){
            for(int[] j:i) Arrays.fill(j,-2);
        }
        boolean[][] visited=new boolean[n][m];
       int ans= totalways(grid,srow,scol,desrow,descol,visited,1,countblocknode,dp);
       System.out.println(ans);
    }
}
