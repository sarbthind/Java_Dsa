import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class signchangestargetsum {
    public static int solve(int[] arr,int index,int target,int[][] dp){
        if(target==0) return 1;
        if(index==0) return arr[0]==target ?1:0;
        if(dp[index][target]!=-1) return dp[index][target];
        int Nottake=solve(arr, index-1, target, dp);
        int take=0;
        if(arr[index]<=target){
                take=solve(arr, index-1, target-arr[index], dp);
        }
        return dp[index][target]=take+Nottake;

    }
    public static int targetsum(int[] arr,int target){
        int sum=0;
        for(int num:arr) sum+=num;
        if((target+sum)%2!=0&&target>sum) return 0;
        int newtarget=(target+sum)/2;             //gives all P and the remaining are N
        int[][] dp=new int[arr.length][newtarget+1];
        for(int[] i:dp) Arrays.fill(i, -1);
        return solve(arr,arr.length-1,newtarget,dp);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target=sc.nextInt();
       // List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int ways= targetsum(arr,target);
    }
}
