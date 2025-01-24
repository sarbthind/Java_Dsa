import java.util.*;
public class rotatearrayktimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        rotatektimesarray(arr,k);
        sc.close();
    }
    public static void rotatektimesarray(int[] arr,int k){
       int n=arr.length;
       k=k%n;
       if(k<0){
        k+=n;
       }
    reversearr(arr,0,n-1);
    reversearr(arr,0,k-1);
    reversearr(arr,k,n-1);
}
    public static void reversearr(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;

        }
    }
}
