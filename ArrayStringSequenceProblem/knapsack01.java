import java.util.Arrays;

public class knapsack01 {
    public static int knapsack(int i,int w,int[] weight,int[] values,int[][]dp){
        if(i==0){
            if(weight[0]<=w) return values[0];
            else return 0;
        }
        if(dp[i][w]!=-1) return dp[i][w];
        int nottake=knapsack(i-1, w, weight, values, dp);

        int take=0;
        if(weight[i]<=w){
            take=values[i]+knapsack(i-1, w-weight[i], weight, values, dp);

        }
        return dp[i][w]=Math.max(take,nottake);
    }
    public static void main(String[] args) {
         int[] weights = {1, 3, 4, 5};
        int[] values  = {1, 4, 5, 7};
        int maxWeight = 7;
        int n = weights.length;

        // dp[i][w] → max value from items 0..i with weight limit w
        int[][] dp = new int[n][maxWeight + 1];
        for (int[] row : dp) Arrays.fill(row, -1);

        int result = knapsack(n - 1, maxWeight, weights, values, dp);
        System.out.println("Max Value: " + result);
    }
}
