import java.util.*;
public class subsequenceminimumnumberofcharactertomakesumequalk {
    public static void solve(String str,int index,String current,int count,int sum,List<String> result,int k,int[] arr){
        if(index==str.length()){
            if(sum==k){
                if(count<arr[0]){
                    arr[0]=count;
                    result.clear();
                    result.add(current);
                }
                else if(count==arr[0]){
                    result.add(current);
                }
            }
            return;
        }
        solve(str, index+1, current, count, sum, result, k, arr);
        solve(str, index+1, current+str.charAt(index), count+1, sum+str.charAt(index), result, k, arr);
    }
    public static void main(String[] args) {
        String str="abcd"; //a->97
        List<String> result=new ArrayList<>();
        int k=197;
        int[] arr=new int[]{Integer.MAX_VALUE};
        solve(str,0,"",0,0,result,k,arr);
        for(String res:result){
            System.out.println(res);
        }
    }
}
