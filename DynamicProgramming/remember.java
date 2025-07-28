import java.util.*;
public class remember {
    public static int findmerit(int[][] dp,int[][] arr,int day,int last){
        if(day==0){
            int maxi=0;
            for(int task=0;task<3;task++){
                if(task!=last){
                    maxi=Math.max(maxi,arr[0][task]);
                }
            }

        }
        int maxi=0;
        for(int task=0;task<3;task++){
            if(task!=last){
                int point=arr[day][task]+findmerit(dp, arr, day-1, last);
                maxi=Math.max(point,maxi);
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][3];
        int[][] dp=new int[n][4];

        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] a:dp) Arrays.fill(a,-1);
        System.out.println(findmerit(dp,arr,n-1,3));

    }
}
