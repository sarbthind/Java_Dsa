import java.util.*;
public class Longestincreasingsubsequnce {
    public static int solve(int[] arr,int index,int prev,List<List<Integer>> result,List<Integer> current,int[] maxsize){
        if(index==arr.length) {
            if(maxsize[0]<current.size()){
                maxsize[0]=current.size();
                result.clear();
                result.add(new ArrayList<>(current));
            }
            else if(current.size()==maxsize[0]){
                result.add(new ArrayList<>(current));
            }
            return 0;
        }
        // if(dp[index][prev+1]!=-1) return dp[index][prev+1];
        int nottake=solve(arr, index+1, prev, result, current,maxsize);
        current.add(arr[index]);
        int take=0;
        if(prev==-1||arr[index]>arr[prev]){
            take=1+solve(arr, index+1, index, result, current,maxsize);
        }
        current.remove(current.size()-1);
        // or ye return dp array me kar de ge to ye memo ho jayega
        return Math.max(take,nottake);
    }
    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        // int n=arr.length;
        List<List<Integer>>result =new ArrayList<>();
       //  int[][] dp = new int[n][n + 1];
        int[] maxsize={Integer.MIN_VALUE};
        int lcs=solve(arr,0,-1,result,new ArrayList<>(),maxsize);
        System.out.println(lcs);
        for(List<Integer> l:result){
            System.out.println(l);
        }
        
    }
}
