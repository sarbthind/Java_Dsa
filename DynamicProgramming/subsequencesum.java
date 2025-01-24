public class subsequencesum {
    // T.C. =O(2**n);
    // public static int f(int[] arr,int n){
    //     if(n==0) return arr[0];
    //     if(n<0) return 0;
    //     int pick=arr[n]+f(arr,n-2);
    //     int notpick=0+f(arr,n-1);
    //     return Math.max(pick,notpick);

    // }
    // public static void main(String[] args) {
    //     int[] arr={2,1,4,9};
    //     int n=arr.length-1;
    //    int ans= f(arr,n);
    //    System.out.println(ans);
    // }

    // Memoization   TC=O(n);
    // public static int f(int[] arr,int n,int[] dp){
    //     if(n==0) return arr[0];
    //     if(n<0) return 0;
    //     if(dp[n]!=-1)return dp[n];
    //     int pick=arr[n]+f(arr,n-2,dp);
    //     int notpick=0+f(arr,n-1,dp);
    //     dp[n]=Math.max(pick, notpick);
    //     return dp[n];

    // }
    // public static void main(String[] args) {
    //     int[] arr={2,1,4,9};
    //     int[] dp=new int[arr.length];
    //     for(int i=0;i<arr.length;i++) dp[i]=-1;
    //     int n=arr.length-1;
    //    int ans= f(arr,n,dp);
    //    System.out.println(ans);
    // }

    // Tabulation 
    // public static void main(String[] args) {
    //         int[] arr={1,2,3,4};
    //         int[] dp=new int[arr.length];
    //         int n=arr.length;
    //         dp[0]=arr[0];
    //         for(int i=1;i<n;i++){
    //             int pick=Integer.MIN_VALUE;
    //             int notpick=Integer.MIN_VALUE;
    //             pick=arr[i];
    //             if(i>1) pick+=dp[i-2];                   
    //             notpick=0+dp[i-1];
    //             dp[i]=Math.max(pick, notpick);
    //         }
    //         System.out.println(dp[n-1]);
            
         
          
    //     }


    // Space optimaization
    // tc O(n)  sc->O(n);

    public static void main(String[] args) {
        int[] arr={2,1,4,9};
        int n=arr.length;
        int prev=arr[0];
        int prev2=0;
       for(int i=1;i<n;i++){
        int pick=Integer.MIN_VALUE;
        int notpick=Integer.MIN_VALUE;
        pick=arr[i];
        if(i>1) pick+=prev2;
        notpick=0+prev;
        int curri=Math.max(pick, notpick);
        prev2=prev;
        prev=curri; 
       }
       System.out.println(prev);
        
     
      
    }
}
