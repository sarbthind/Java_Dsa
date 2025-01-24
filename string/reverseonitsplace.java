// package string;
import java.util.*;

public class reverseonitsplace {
    public static String reverseonplace(String input) {
        StringBuilder str=new StringBuilder();
        StringBuilder result=new StringBuilder();
        str.append(input);
        str.reverse();
        result.append(str.toString());

        // input.reverse();
        // char[] word=input.toCharArray();
        // int s=0;
        // int e=input.length();
        // while(s<e){
        //     char temp=word[s];
        //     word[s]=word[e];
        //     word[e]=temp;


        // }
        // return word.toString();
        return result.toString();

    }
    public static void main(String[] args) {
        String input = "sarb raj singh";
        String[] word=input.split(" ");
        for(int i=0;i<word.length;i++){
            word[i] = reverseonplace(word[i]);

        }
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + String.join(" ",word));
    



}
}
