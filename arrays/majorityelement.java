import java.util.*;

public class majorityelement {
    // public static void main(String[] args) {

    // Scanner sc=new Scanner(System.in);
    // int[] arr=new int[5];
    // int n=arr.length;
    // System.out.print("Enter the elements of Array:- ");
    // for(int i=0;i<n;i++){
    // arr[i]=sc.nextInt();
    // }
    // int ans=majorityele(arr,n);
    // System.out.println(ans);
    // }
    // public static int majorityele(int[] arr,int n){
    // int maxi=0;
    // int count=1;
    // for(int i=0;i<n;i++){
    // for(int j=0;j<n;j++){
    // if(arr[j]==arr[i]&&i!=j){
    // count++;
    // }
    // }

    // maxi=Math.max(maxi, count);
    // System.out.println("maxi value is " + maxi);
    // if(count>n/2){
    // return arr[i];
    // }
    // }
    // return -1;
    // }


    // boyer moore approach
    public static int majorityElement(int[] arr) {
        // size of the given array:
        int n = arr.length;
        int count = 0; // count
        int ele = 0; // Element
        // applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                ele = arr[i];
            } else if (ele == arr[i])
                count++;
            else
                count--;
        }
        // checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele)
                cnt1++;
        }
        if (cnt1 > (n / 2))
            return ele;
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = new int [5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
        sc.close();
    }
}
 