import java.util.*;
public class CountSubsequencesWithSumK {
    public static int solve(int[] arr,int index,int sum,int target){
        if(index==arr.length) return (sum==target)?1:0;
        // if(dp[index][sum]!=-1) return dp[index][sum];
        int take=solve(arr, index+1, sum+arr[index], target);
        int nottake=solve(arr, index+1, sum, target);
        return take+nottake;
        // return dp[index][sum]=take+nottake;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,1};
        int target=2;
        // int maxsum=Arrays.stream(arr).sum();
        // int[][] dp=new int[arr.length][target+maxsum+1];
        int count= solve(arr,0,0,target);
        System.out.println(count);
        sc.close();
    }
}
