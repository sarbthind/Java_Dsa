// package string;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        String result=reverse(str);
        Boolean ans=ispalindrome(result,str);
        if(ans){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
        sc.close();
    }
    public static String reverse(String str){
        String revstr="";
        for(int i=str.length()-1;i>=0;i--){
            revstr+=str.charAt(i);
        }
        return revstr;
    }
    public static Boolean ispalindrome(String result,String str ){
        Boolean ans=result.equals(str);
        return ans;
      
    }
    
}
