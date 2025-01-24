public class houserober2 {
    public static int rob(int[] nums){
        int n=nums.length;
        if(n==0) return 0;
        if(n==1) return nums[0];
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
       return dp[n-1];
    }
    public static void main(String[] args) {
            int[] nums={1,1,3,3};
            int n=nums.length;
            int[] temp=new int[n-1];
            int[] temp2=new int[n-1];
            for(int i=0;i<n;i++){
                if(i!=0) temp[i-1]=nums[i];
                if(i!=n-1) temp2[i]=nums[i];
            }

            System.out.println(Math.max(rob(temp), rob(temp2)));
            
           
            
        
    }
}
