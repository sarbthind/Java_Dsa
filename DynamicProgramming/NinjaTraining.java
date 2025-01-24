public class NinjaTraining {
    // simple recursion
    // public static int f(int[][] arr,int day,int last){
    //     if(day==0){
    //        int maxi=0;
    //        for(int task=0;task<3;task++){
    //         if(task!=last){
    //             maxi=Math.max(maxi,arr[0][task]);
    //         }
    //        }
    //        return maxi;
    //     }

    //     int maxi=0;
    //     for(int task=0;task<3;task++){
    //         if(task!=last){
    //             int point=arr[day][task]+f(arr,day-1,task);
    //             maxi=Math.max(maxi,point);
    //         }
    //     }
    //     return maxi;


        
    // }
    // public static void main(String[] args) {
    //     int[][] arr={
    //         {1,2,3},
    //         {2,3,4},
    //         {3,4,5}
    //     };
    //     int n=arr.length;
    //     int ans=f(arr,n-1,3);
    //     System.out.println(ans);
    // }
    // // Memoization TC O(N*4)*3   SC O(N)+O(N*4);
    // public static int f(int[][] arr,int day,int last,int[][] dp){
    //     if(day==0){
    //        int maxi=0;
    //        for(int task=0;task<3;task++){
    //         if(task!=last){
    //             maxi=Math.max(maxi,arr[0][task]);
    //         }
    //        }
    //        return maxi;
    //     }
    //     if(dp[day][last]!=-1) return dp[day][last];

    //     int maxi=0;
    //     for(int task=0;task<3;task++){
    //         if(task!=last){
    //             int point=arr[day][task]+f(arr,day-1,task,dp);
    //             maxi=Math.max(maxi,point);
    //         }
    //     }
    //     return dp[day][last]=maxi;


        
    // }
    // public static void main(String[] args) {
    //     int[][] arr={
    //         {1,8,3},
    //         {2,3,4},
    //         {3,4,5}
    //     };
    //     int[][] dp=new int[arr.length][4];
    //     for(int i=0;i<dp.length;i++){
    //         for(int j=0;j<4;j++){
    //             dp[i][j]=-1;
    //         }
    //     }
    //     int n=arr.length;
    //     int ans=f(arr,n-1,3,dp);
    //     System.out.println(ans);
    // }

    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {1,2,3},
            {1,2,3}
        };
        int[][] dp=new int[arr.length][4];
        dp[0][0]=Math.max(arr[0][1], arr[0][2]);
        dp[0][1]=Math.max(arr[0][0], arr[0][2]);
        dp[0][2]=Math.max(arr[0][0], arr[0][1]);
        dp[0][3]=Math.max(arr[0][0], Math.max(arr[0][1],arr[0][2]));

        for(int day=1;day<arr.length;day++){
            for(int last=0;last<4;last++){
                int maxi=0;
                for(int task=0;task<3;task++){
                    if(task!=last){
                        int point=arr[day][task]+dp[day-1][task];
                        maxi=Math.max(maxi,point);
                    }
                }
                dp[day][last]=maxi;
                
            }
        }
        // System.out.println(dp[arr.length-1][3]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<4;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println(

            );
        }
    }
}
