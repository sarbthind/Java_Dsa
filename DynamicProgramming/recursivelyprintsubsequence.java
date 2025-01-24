import java.util.ArrayList;
import java.util.*;
public class recursivelyprintsubsequence {
    static void printsubsequence(int[] arr,List<Integer> l,int n){
        if(n==arr.length){
           for(int i:l){
            System.out.print(i+" ");
           }
           System.out.println();
           return;
           }
        
        l.add(arr[n]);
        printsubsequence(arr, l, n+1); //i am atking the index;
        l.remove(l.size()-1);
        printsubsequence(arr, l, n+1);//not taking the current index
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<Integer> l=new ArrayList<>();
        printsubsequence(arr,l,0);
    }
}
