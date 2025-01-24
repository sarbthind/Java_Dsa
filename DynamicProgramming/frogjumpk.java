public class frogjumpk {
    // Simple for k steps
    // public static int findminfromkjump(int[] arr,int n,int k){
    //     if(n==0) return 0;
    //     int minsteps=Integer.MAX_VALUE;
    //     for(int j=1;j<=k;j++){
    //         if(n-j>=0){
    //             int jump=findminfromkjump(arr,n-j,k)+Math.abs(arr[n]-arr[n-j]);
    //             minsteps=Math.min(jump, minsteps);
    //         }
    //     }
    //     return minsteps;
    // }
    // public static void main(String[] args) {
    //     int[] arr={10,20,30,40,50,60};
    //     int n=arr.length-1;
    //     int k=3;
    //     int ans=findminfromkjump(arr,n,k);
    //     System.out.println(ans);

    // }

    // Memoziation

    // public static int findminfromkjump(int[] arr,int n,int k,int[] dp){
    //     if(n==0) return 0;
    //     if(dp[n]!=-1) return dp[n];
    //     int minsteps=Integer.MAX_VALUE;
    //     for(int j=1;j<=k;j++){
    //         if(n-j>=0){
    //             int jump=findminfromkjump(arr,n-j,k,dp)+Math.abs(arr[n]-arr[n-j]);
    //             minsteps=Math.min(jump, minsteps);
    //         }
    //     }
    //     dp[n]=minsteps;
    //     return dp[n];
    // }
    // public static void main(String[] args) {
    //     int[] arr={10,20,30,40,50,60};
    //     int n=arr.length;
    //     int[] dp=new int[n+1];
    //     for(int i=0;i<=n;i++) dp[i]=-1;
    //     int k=3;
    //     int ans=findminfromkjump(arr,n-1,k,dp);
    //     System.out.println(dp[n-1]);

    // }


  
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60}; 
        int n = arr.length;                  
        int[] dp = new int[n];               
        int k = 3;                           
    
        dp[0] = 0; 
    
        
        for (int i = 1; i < n; i++) {
            int minstep = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jump = dp[i - j] + Math.abs(arr[i] - arr[i - j]);
                    minstep = Math.min(jump, minstep);
                }
            }
            dp[i] = minstep; 
        }
    
        
        System.out.println(dp[n - 1]);
    }
    


}

