import java.util.Scanner;
public class primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        // Boolean flag=true;
        
        // if(num<=1){
        //     flag=false;
        // }
        // else{

        //     for(int i=2;i*i<num;i++){
        //         if(num%i==0){
        //             flag=false;
        //             break;
        //         }
        //     }

        // }
        // if(flag){
        //     System.out.println("number is prime");
        // }
        // else{
        //     System.out.println("number is not prime");
        // }







        if(isprime(num)){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
        sc.close();
        
    }
    public static boolean isprime(int x){

    if(x<=1){
        return false;
    }
    if(x<=3){
        return true;
    }
    if(x%2==0||x%3==0){
        return false;
    }
    for(int i=5;i*i<x;i++){
        if(x%i==0||x%(i+2)==0){
            return false;
        }

    }
    return true;


}
}
