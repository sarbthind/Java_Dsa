import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class subsetsumequalsk {
    public static int subsetsumequalk(int[] arr,int index,int currentsum,int target,int count,List<Integer> current,List<List<Integer>> result){
        if(index==arr.length){
            if(currentsum==target){
                count++;
                result.add(new ArrayList<>(current));
            }
            return count;
        }
        current.add(arr[index]);
        int include=subsetsumequalk(arr,index+1,currentsum+arr[index],target,count,current,result);
        current.remove(current.size()-1);
        int exclude=subsetsumequalk(arr, index+1, currentsum, target, count,current,result);
        return include + exclude;
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=sc.nextInt();
        List<List<Integer>> result=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count= subsetsumequalk(arr,0,0,k,0,new ArrayList<>(),result);
        System.out.println(count);
        for(List<Integer> subset:result){
            System.out.println(subset);
        }

        sc.close();
    }
    
}