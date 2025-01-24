import java.util.*;
public class countofdigits {
    public static void main(String[] str){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
       int ans=counttillsingledigit(n);
       System.out.println(ans);
       sc.close();
    }
    
    public static int counttillsingledigit(int n){
        int ans=0;
        int temp=n;
        int sum=0;
        while (n!=0) {
            while (temp!=0) {
                sum+=temp%10;
                temp/=10;
                
            }
            ans++;
            temp=sum;
            if(sum<10){
                break;
            }
            sum=0;
            n/=10;
            
        }
        return ans;
    }
}
