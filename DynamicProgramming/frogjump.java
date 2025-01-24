import java.util.*;
public class frogjump {
    // Simple bilkul simple
    // public static int mincost(int n,int[] arr){
    //     if(n==0) return 0;
    //     int left=mincost(n-1,arr)+Math.abs(arr[n]-arr[n-1]);
    //     int right=Integer.MAX_VALUE;
    //     if(n>1){
    //         right=mincost(n-2, arr)+Math.abs(arr[n]-arr[n-2]);
    //     }
    //     return Math.min(left, right);
    // }
    // public static void main(String[] args) {
    //     int[] arr={10,20,30,40,50,60};
    //     int n=arr.length-1;
    //     int cost=mincost(n,arr);
    //     System.out.println(cost);

    // }

    // Memoziation

//     public static int mincost(int n,int[] arr,int[] dp){
//         if(n==0) return 0;
//         if(dp[n]!=-1) return dp[n];
//         int left=mincost(n-1,arr,dp)+Math.abs(arr[n]-arr[n-1]);
//         int right=Integer.MAX_VALUE;
//         if(n>1){
//             right=mincost(n-2, arr,dp)+Math.abs(arr[n]-arr[n-2]);
//         }
//         return dp[n]= Math.min(left, right);
//     }
//     public static void main(String[] args) {
//         int[] arr={10,20,30,40,50,60};
//         int[] dp=new int[arr.length+1];
//         for(int i=0;i<=arr.length;i++) dp[i]=-1;
//         int n=arr.length-1;
//         int cost=mincost(n,arr,dp);
//         System.out.println(cost);

//     }

// Tabulation


// public static void main(String[] args) {
//     int[] arr={10,20,30,40,50,60};
//     int n=arr.length;
//     int[] dp=new int[n+1];
//     for(int i=0;i<=n;i++) dp[i]=-1;
//     dp[0]=0;
//     for(int i=1;i<n;i++){
//       int fs=dp[i-1]+Math.abs(arr[i]-arr[i-1]);
//       int ss=Integer.MAX_VALUE;
//       if(i>1){
//         ss=dp[i-2]+Math.abs(arr[i]-arr[i-2]);
//       }
//       dp[i]=Math.min(fs, ss);

//     }
//     System.out.println(dp[n-1]);
   
    

// }

// Space Optimization
public static void main(String[] args) {
    int[] arr={10,20,30,40,50,60};
    int n=arr.length;
    int prev1=0;
    int prev2=0;
    for(int i=1;i<n;i++){
      int fs=prev1+Math.abs(arr[i]-arr[i-1]);
      int ss=Integer.MAX_VALUE;
      if(i>1){
        ss=prev2+Math.abs(arr[i]-arr[i-2]);
      }
      int currenti=Math.min(fs, ss);
      prev2=prev1;
      prev1=currenti;

    }
    System.out.println(prev1);
   
    

}
}
