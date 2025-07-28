import java.util.*;
public class subsetsumequalkwithnegatives {
    public static int findsusbetwithnegativeequaltarget(int[] arr,int index,int sum,int target,int[][] dp,int totalsum,List<Integer> current,List<List<Integer>> result){
        if(index==arr.length){
            if(sum==target){
                result.add(new ArrayList<>(current));
            }
            return sum==target?1:0;
        }
        if(dp[index][sum+totalsum]!=-1) return dp[index][sum+totalsum];
        current.add(arr[index]);
       int include= findsusbetwithnegativeequaltarget(arr, index+1, sum+arr[index], target, dp, totalsum, current, result);
        current.remove(current.size()-1);
       int exclude= findsusbetwithnegativeequaltarget(arr, index+1, sum, target, dp, totalsum, current, result);
       return dp[index][sum+totalsum]=include+exclude;
    }



    public static int wrapper(int[] arr,int target,List<List<Integer>> result){
        int totalsum=0;
        for(int num:arr) totalsum+=Math.abs(num);
        int[][] dp=new int[arr.length][2*totalsum+1];
        for(int[] row:dp) Arrays.fill(row,-1);
        return findsusbetwithnegativeequaltarget(arr,0,0,target,dp,totalsum,new ArrayList<>(),result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int count= wrapper(arr,k,result);
       System.out.println(count);
    //    for(List<Integer> subset:result){
    //     System.out.println(subset);
    //    }
    // dont use memoiazation when we find have to find subset also in list
    }
}
