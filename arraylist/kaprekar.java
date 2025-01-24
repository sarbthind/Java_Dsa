package arraylist;
import java.util.*;

public class kaprekar {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            Kaprekar(n);
            sc.close();
        
    }
    public static void Kaprekar(int n){
        boolean flag=false;
        if(n==1){
           return;
        }
        int sq=n*n;
        int countdigits=0;
        while(sq!=0){
            countdigits++;
            sq/=10;

        }
        sq=n*n;
        int sum=0;
        for(int i=1;i<countdigits;i++){
            int pow=(int) Math.pow(10, i);
            if(n==pow){
                System.out.println("powers 10 are not caprekar");
                flag=true;
                continue;
            }
            sum=sq/pow+sq%pow;
            System.out.println("sum inside  "+sum);
            if(sum==n){
                flag=true;
                System.out.println(sq/pow + " " + sq%pow);
            }
            
        }
        System.out.println("value of sum is: "+sum);
        if(flag==false){
            System.out.println("not  a kaprekar number");
        }
        
        
    }
    
}
