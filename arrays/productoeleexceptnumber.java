import java.util.*;
public class productoeleexceptnumber {
    public static int[] solve(int[] arr){
       int presum=1;
       int[] temp=new int[arr.length];
    //    for(int i=0;i<arr.length;i++){
    //     temp[i]=arr[i];
    //    }
     temp[0]=presum;
       for(int i=0;i<arr.length-1;i++){
        temp[i+1]=presum*arr[i];
        presum=temp[i+1];
       }

       int postproduct=1;
       for(int i=arr.length-1;i>=0;i--){
           temp[i]=temp[i]*postproduct;
           postproduct=arr[i]*postproduct;
           
        }
       return temp;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       int[] ans= solve(arr);
        for(int num:ans){
            System.out.print(num+" ");
        }
        sc.close();
    }
}
