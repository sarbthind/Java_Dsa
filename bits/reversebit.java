package bits;
import java.util.*;
public class reversebit {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        for(int i=0;i<32;i++){
            result<<=1;
            result|=(n&1);
            n>>=1;
        }
        System.out.println(result);
        sc.close();
    }
    
}
