import java.util.ArrayList;
import java.util.List;

public class allpermutationofarr {
    public static void helper(int[] nums,List<List<Integer>> ans,List<Integer> l,boolean[] isvalid){
        if(l.size()==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<l.size();i++){
                temp.add(l.get(i));
            }
            ans.add(temp);
            return ;
        }

        for(int i=0;i<nums.length;i++){
            if(isvalid[i]==false){
                l.add(nums[i]);
                isvalid[i]=true;
                helper(nums,ans,l,isvalid);
                isvalid[i]=false;
                l.remove(l.size()-1);
            }
        }
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        boolean[] isvalid=new boolean[nums.length];
        helper(nums,ans,l,isvalid);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        List<List<Integer>> ans=permute(nums);
        for(List i:ans) System.out.println(i);
    }
}

