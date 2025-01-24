// package string;
import java.util.*;
public class stringword1streverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            arr[i]=reverse(arr[i]);
        }
        String result=String.join(" ",arr);
        // split("[//s|][,]|[.]")
        System.out.println("the reversed string is  "+ result);
        sc.close();
    }
    public static String reverse(String str){
        char[] word=str.toCharArray();
        int end=word.length-1;
        char temp=word[0];
        word[0]=word[end];
        word[end]=temp;
     return new String(word)  ; 
    }
}
