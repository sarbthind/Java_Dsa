import java.util.*;
class fibonacci{
    // Memoization tc o(n) sc(o(n)+o(n))
    public static int f(int n,int[] dp){
        if(n<=1) return n;
        if (dp[n]!=-1) return dp[n];
        return dp[n]=f(n-1,dp)+f(n-2,dp);
    }
    // public static void main(String[] args) {
    //     int n=5;
    //     int[] dp=new int[n+1];
    //     for(int i=0;i<n+1;i++) dp[i]=-1;
    //     int ans=f(n,dp);
    //     System.out.println(ans);
    // }


    // Tabulation tc o(n) sc o(n)
    // public static void main(String[] args) {
    //     int n=6;
    //     int[] dp=new int[n+1];
    //     dp[0]=0;
    //     dp[1]=1;
    //     for(int i=2;i<=n;i++){
    //         dp[i]=dp[i-1]+dp[i-2];
    //     }
    //     System.out.println(dp[n]);
    // }

    // sc=constant
    public static void main(String[] args) {
        int n=6;
        int prev1=1,prev2=0;
        for(int i=2;i<=n;i++){
            int current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        System.out.println(prev1);
    }
}