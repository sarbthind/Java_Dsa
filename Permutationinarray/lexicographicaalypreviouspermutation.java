import java.util.*;
public class lexicographicaalypreviouspermutation {
    public static void permuteprevious(int[] arr,boolean[] visited){
        int n=arr.length;
        int i=n-2;
        while (i>0&&arr[i]<=arr[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while(j>i&&arr[j]>=arr[i]) j--;
            swap(arr,j,i);
        }
        reverse(arr,i+1,n-1);
    }
    public static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
    public static void reverse(int[] arr,int s,int e){
        while(s<e){
            swap(arr,s++,e--);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,3,1,2,5};
        boolean[] visited=new boolean[arr.length];
        permuteprevious(arr,visited);
        System.out.println(Arrays.toString(arr));
    }
}
