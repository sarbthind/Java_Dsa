package arraylist;
import java.util.Scanner;

public class closestfibo {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        closestfibonanci(n);
        sc.close();
    }
    public static void closestfibonanci(int n){
        int a=0,b=1;
        while (b<n) {
            int temp=b;
            b=a+b;
            a=temp;
            
        }
        if(n-a<b-n){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
