import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class signchangetargetsumwithsign {
    public static void findsignandtarget(int[] arr,int index,int sum,int target,List<String> ans,String current ){
        if(index==arr.length){
            if(sum==target){
                ans.add(current);
            }
            return;
        }
        findsignandtarget(arr, index+1, sum+arr[index], target, ans, current+"+"+arr[index]);
        findsignandtarget(arr, index+1, sum-arr[index], target, ans, current+"-"+arr[index]);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=sc.nextInt();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findsignandtarget(arr,0,0,k,ans,"");
        for(String s:ans){
            System.out.println(s);
        }
    }

}