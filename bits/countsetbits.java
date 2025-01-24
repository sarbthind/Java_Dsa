package bits;
import java.util.*;

public class countsetbits {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int count=0;
        while(n>0){
            count+=(n&1);
            n>>=1;
        }
        System.out.println(count);
        sc.close();
    }
}
