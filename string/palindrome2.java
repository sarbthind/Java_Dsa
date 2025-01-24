// package string;

import java.util.Scanner;

public class palindrome2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str;
        str=sc.nextLine();
        boolean ans=palin(str);
        System.out.println(ans);
        sc.close();
    }
    public static boolean palin(String str){
        int s=0;
        int e=str.length()-1;
        while (s<e) { 
            if(str.charAt(s++)!=str.charAt(e--))
                return false;
            
        }
        return true;
    }
}
