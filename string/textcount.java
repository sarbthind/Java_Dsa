// package string;
import java.util.*;
public class textcount {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
    //     String str=sc.nextLine();
    //     String[] arr=str.split(" ");
    //     // for (int index = 0; index < arr.length; index++) {
    //     //     System.out.println(arr[index]);
    //     // }
    //     int count=0;
    //     int[] arrr=new int[arr.length];
    //     int k=0;
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr.length-1;j++){
    //             if(arr[i]==arr[j]&&i!=j){
    //                 ++count;
    //                 arrr[k]=count;
    //             }
    //             // System.out.println("value of: k is "+k);
    //             // System.out.println("value of count is"+count);
                
    //     }
    //     System.out.println("value of count is "+count);
    //     System.out.println("value of k is  "+k);
    //     ++k;
    //     count=0;
    // }
    // for (int i = 0; i < arrr.length; i++) {
    //     System.out.println(arrr[i]);
        
    // }


        int count=1;
    String str=sc.nextLine();
    String[] arr=str.split(" ");
    // for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i]);
    // }

    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i].equals(arr[j]) && i!=j){
                count++;
                
            }
            
        }
    }
    System.out.println(count);
    sc.close();
}
}
