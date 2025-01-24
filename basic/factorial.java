import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println(ans);
        sc.close();
    }
    public static int fact(int n){
        int ans=1;
      for(int i=1;i<=n;i++){
        ans=ans*i;  
      }
      return ans;
      
    }
}
