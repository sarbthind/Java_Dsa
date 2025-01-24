public class nstairs {
    public static int countways(int n,int[] dp){
        if(n==0||n==1){
            return 1;
        }
        if(dp[n]==-1) return dp[n];
        return dp[n]=countways(n-1,dp)+countways(n-2,dp);
    }
    // public static void main(String[] args) {
    //     int n=5;
    //     int[] dp=new int[n+1];
    //     int ans=countways(n,dp);
    //     System.out.println(ans);
    // }


    // public static void main(String[] args) {
    //     int n=5;
    //     int[] dp=new int[n+1];
    //     dp[0]=1;
    //     dp[1]=1;
    //     for(int i=2;i<=n;i++){
    //         dp[i]=dp[i-1]+dp[i-2];

    //     }
    //     System.out.println(dp[n]);
     

    // }

    public static void main(String[] args) {
        int n=2;
        int prev1=1;
        int prev2=1;
        for(int i=2;i<=n;i++){
            int current=prev1+prev2;
            prev2=prev1;
            prev1=current;
        }
        System.out.println(prev1);
    }
}
