import java.util.*;

public class countnumberofpsitiveandnegativechangesignequaltarget {
    public static int countways(int[] arr,int index,int sum,int target){
        if(index==arr.length) return sum==target?1:0;

        int plus=countways(arr, index+1, sum+arr[index], target);
        int minus=countways(arr, index+1, sum-arr[index], target);

        return plus+minus;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        /* we have P for those element to whom we give +ve sign and N for those to whom we give -ve sign 
         * and P+N=totalsum
         * and P-N=target
         * by adding both equation we will get   P=(totalsum+target)/2;
         * 
         */
        int ways=countways(arr,0,0,target);
        System.out.println(ways);
    }
}
