// package string;
import java.util.Scanner;
public class reversestring {
    public static void main(String[] args) {
        System.out.println("enter a string");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=reversestr(str);
        System.out.println(ans);
        sc.close();
    }
    public static String reversestr(String str){
        String revstr="";
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            revstr+=str.charAt(i);
        }
        return revstr;
    }
}
