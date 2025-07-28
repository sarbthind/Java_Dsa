import java.util.*;

public class unboundedknapsack {
    // we can choose unlimited items same aitem as many times
    public static int unboundedKnapsack(int i,int w,int[] wt,int[] val,int[][] dp){
        if(i==0){
            return (w/wt[0])*val[0];
        }
        if(dp[i][w]!=-1) return dp[i][w];
        int nottake=unboundedKnapsack(i-1, w, wt, val, dp);

        int take=0;
        if(wt[i]<=w){
            take=val[i]+unboundedKnapsack(i-1, w-wt[i], wt, val, dp);
        }
        return dp[i][w]=Math.max(take,nottake);
    }
     public static void main(String[] args) {
        int[] wt = {2, 4, 6};
        int[] val = {5, 11, 13};
        int W = 10;
        int n = wt.length;

        int[][] dp = new int[n][W + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int result = unboundedKnapsack(n - 1, W, wt, val, dp);
        System.out.println("Max Value: " + result);
    }
}
