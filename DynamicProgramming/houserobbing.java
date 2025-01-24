public class houserobbing {
    // Tabulation
    public static void main(String[] args){
        int[] nums={2,4,6,5};
        int n=nums.length;
        int[] dp=new int[n];
        dp[0]=nums[0];
        for(int i=1;i<n;i++){
            int rob=Integer.MIN_VALUE;
            int notrob=Integer.MIN_VALUE;
            rob=nums[i];
            if(i>1) rob+=dp[i-2];
            notrob=0+dp[i-1];
            dp[i]=Math.max(rob, notrob);

        }
        System.out.println(dp[n-1]);
        
    }
}
