// import java.lang.reflect.Array;
import java.util.*;

public class onemissingonetwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        int n=arr.length;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int duplicate=0;
        int missing=0;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
         
                if(arr[i]==arr[i+1]){
                    duplicate=arr[i];
                }
                
                if(arr[i+1]-arr[i]>1){
                    missing=arr[i]+1;
                }
                
                
            
        }
        // for (int i = 0; i < n - 1; i++) {
        //     if (arr[i + 1] - arr[i] > 1) {
        //         missing = arr[i] + 1;
        //     }
        // }
    
        System.out.println("mising is " + missing);
        System.out.println("duplicate is "+ duplicate);
        sc.close();

    }
}
