import java.util.*;
public class Printsubsequencesumequalsk {
    public static void solve(int[] arr,int index,int sum,List<Integer> current,int target){
        if(index==arr.length){
            if(sum==target){
                System.out.println(current);
            }
            return;
        }
        current.add(arr[index]);
        solve(arr, index+1, sum+arr[index], current, target);
        current.remove(current.size()-1);
        solve(arr, index+1, sum, current, target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,1};
        int target=2;
        solve(arr,0,0,new ArrayList<>(),target);
        sc.close();
    }
}
