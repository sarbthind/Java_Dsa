import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minimumsubsetelementsumequalk {
    public static void solve(int[] arr,int index,int sum,int target,List<List<Integer>> result,List<Integer> current,int[] minsize){
        if(index==arr.length){
            if(sum==target){
                if(current.size()<minsize[0]){
                    minsize[0]=current.size();
                    result.clear();
                    result.add(new ArrayList<>(current));
                }
                else if(current.size()==minsize[0]){
                    result.add(new ArrayList<>(current));
                }
            }
            return;
        }
        current.add(arr[index]);
        solve(arr, index+1, sum+arr[index], target, result, current, minsize);
        current.remove(current.size()-1);
        solve(arr, index+1, sum, target, result, current, minsize);
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
        int[] minsize={Integer.MAX_VALUE};
        solve(arr,0,0,k,result,new ArrayList<>(),minsize);
        for(List<Integer> l:result){
            System.out.println(l);
        }
    }
}
