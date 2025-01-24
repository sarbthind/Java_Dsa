import java.util.Arrays;

public class subsetsumequalsK {
    // Simple recursion TC O(2**n) SC=O(n)+O(n)
    // public static int f(int[] arr,int target,int n,int currsum){
    //     if(currsum==target) return 1;
    //     if(n==0) return 0;
    //     int include=f(arr,target,n-1,currsum+arr[n]);
    //     int exclude=f(arr,target,n-1,currsum);
    //     if(include==1||exclude==1){
    //         return 1;
    //     }
    //     return 0;
    // }
    // public static void main(String[] args) {
    //     int[] arr={1,4,5,10,16};
    //     int target=9;
    //     int n=arr.length;
    //     int ans=f(arr,target,n-1,0);
    //     System.out.println(ans);
    // }

    // Memoziation
    public static int f(int[] arr,int target,int n,int currsum,int dp[][]){
        if(currsum==target) return 1;
        if(n<0) return 0;
        if(dp[n][currsum]!=-1) return dp[n][currsum];
    
        int exclude=f(arr,target,n-1,currsum,dp);
        int include=0;
        if(currsum+arr[n]<=target){
         include=f(arr,target,n-1,currsum+arr[n],dp);
        }
        dp[n][currsum]=(exclude==1||include==1)?1:0;
        return dp[n][currsum];
        
       
    }
    public static void main(String[] args) {
        int[] arr={1,4,5,10,16};
        int target=9;
        int n=arr.length;
        int[][] dp=new int[n][target+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        int ans=f(arr,target,n-1,0,dp);
        System.out.println(ans);
      
    }
}
