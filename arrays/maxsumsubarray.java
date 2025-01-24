
// import java.util.Arrays;

// import java.util.ArrayList;

public class maxsumsubarray {
    // public static void main(String[] args) {
    // Scanner sc=new Scanner(System.in);
    // int[] arr=new int[5];
    // int n=arr.length;
    // for(int i=0;i<arr.length;i++){
    // arr[i]=sc.nextInt();
    // }
    // int maxsum=maxsumarray(arr,n);
    // System.out.println(maxsum);
    // }

    // public static int maxsumarray(int[] arr,int n){
    // int maxi=Integer.MIN_VALUE;
    // for(int i=0;i<n;i++){
    // for(int j=i;j<n;j++){
    // int sum=0;
    // // for(int k=i;k<=j;k++){
    // sum+=arr[j];
    // // }
    // maxi=Math.max(maxi, sum);
    // }
    // }
    // return maxi;
    // }

    // kadanes method
    // good approach
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;
        // ArrayList<Integer> arrr=new ArrayList<>();

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
                // arrr.add(arr[i]);
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        // if (maxi < 0) maxi = 0;
        // System.out.println(arrr);

        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
        
    }

}
