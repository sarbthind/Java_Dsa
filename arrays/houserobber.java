import java.util.*;
class houserobber{
    public static int newhelper(int n,int[] arr){
        if(n<0){
            return 0;
        }
       
        int ans2=arr[n]+newhelper(n-2,arr);
        System.out.println("from ans 2: "+ans2+" ");
        return ans2;
    }
    public static int helper(int n,int[] arr){
        if(n<0){
            return 0;
        }
        int ans1=arr[n]+helper(n-2, arr);
        System.out.println("from ans 1: "+ans1+" ");
        return ans1;
      
    }
    public static int findmaxsum(int[] arr){
        int n=arr.length;
      int ans1=helper(n-1,arr);
      int ans2=newhelper(n-2,arr);
      return Math.max(ans1, ans2);
       
       
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       
       int ans= findmaxsum(arr);
       System.out.print(ans);

    }
}