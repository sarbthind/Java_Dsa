import java.util.*;
public class canpartitionintoequalsum {
    public static boolean solve(int[] arr,int index,int sum,int target,List<Integer> current,List<List<Integer>> result){
            if(sum==target){
                result.add(new ArrayList<>(current));
                return true;
            }
           if(index==arr.length) return false;
        //    if(dp[index][target]!=-1) return dp[index][target];
       // boolean include =false;
        // if(arr[index]<=target){
            // include=solve(arr, index+1,sum, target-arr[index], current, result);
        // }
        // boolean exclude=solve(arr, index+1, sum, target, current, result)
        // return dp[index][target]=include||exclude;
           current.add(arr[index]);
           boolean include=solve(arr, index+1, sum+arr[index], target, current, result);
           current.remove(current.size()-1);
           boolean exclude=solve(arr, index+1, sum, target, current, result);
        
           return include|| exclude;

        }

    
    public static boolean canpartition(int[] arr,List<List<Integer>> result){
        int total=0;
        for(int num:arr) total+=num;
        if(total%2!=0) return false;
        int target=total/2;
        // Boolean[][] dp=new Boolean[arr.length][target+1];
        return solve(arr,0,0,target,new ArrayList<>(),result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> result=new ArrayList<>();
        System.out.println(canpartition(arr,result));
        for(List<Integer> subset: result){
            System.out.println(subset);
        }
        sc.close();

    }
}
