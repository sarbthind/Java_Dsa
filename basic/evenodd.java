import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if((n&1)==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
        sc.close();
    }
}
