import java.util.Scanner;

public class aggressivecows {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[5];
        int n=arr.length;
        int k=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(aggrescow(arr,n,k));
        
        sc.close();
    }
    public static int  aggrescow(int[] arr,int n,int k){
        int l=1;
        int r=100000;
        int ans=-1;
        int mid=l+(r-l)/2;
        if(ok(arr,mid,k)){
            ans=mid;
            l=mid+1;
        }
        else{
            r=mid-1;
        }
        return ans;

    }
    public static boolean ok(int[] arr ,int mid,int k){
        int n=arr.length;
        int count=1;
        int firstindex=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]-firstindex>=mid){
                firstindex=arr[i];
                count++;
            }
            else{
                continue;
            }
            
        }
        if(count>=k){
            return true;
        }
       return false;
    }
}
