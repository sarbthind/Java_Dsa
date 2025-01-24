// package string;
import java.util.Scanner;

public class countpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] word=str.split(" ");
        int count=0;
        for(int i=0;i<word.length;i++){
           if(number(word[i])){
            count++;
           }
        
        }
        System.out.println(count);
    }
    public static boolean number(String str){
        int s=0;
        int e=str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
        }
        return true;
    }
}
