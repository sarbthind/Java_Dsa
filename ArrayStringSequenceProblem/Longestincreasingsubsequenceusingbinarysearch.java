import java.util.*;
public class Longestincreasingsubsequenceusingbinarysearch {
    public static int lengthoflis(int[] arr){
        List<Integer> temp=new ArrayList<>();
        for(int num:arr){
            int idx=Collections.binarySearch(temp,num);

            if(idx<0) idx=-(idx)-1;

            if(idx==temp.size()){
                temp.add(num);
            }
            else{
                temp.set(idx,num);
            }
        }
        return temp.size();
    }
    // it is in the complexity of O(NLOG(N)) using binary search it doesnot give the complete all sequence but it gives us maximum pof them
    public static void main(String[] args) {
        // so we have something called Collection.binarySearch() that return negative value if not present in that array 
        // how like we have{1,2,5} if we check it for 4 it gives us index -(idx)-1 like here where we can insert 4 aat 2 nd undex to remain it sorted it gives -2 -1=-3
        //to get correct index we use if (idx<0) then we use idx=-(idx)-1; it gives us 2;
        int[] arr={10,9,2,5,3,7,102,18};
        int lislength=lengthoflis(arr);
        System.out.println(lislength);
    }
}
