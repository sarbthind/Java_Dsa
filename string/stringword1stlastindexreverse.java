// package string;
import java.util.*;

public class stringword1stlastindexreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String output=reverse(input);
        System.out.println(output);
        sc.close();
    }
    public static String reverse(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        // for(String word:words){
        //     if(word.length()>1){
        //         result.append(word.charAt(word.length()-1)).append(word.substring(1, word.length()-1)).append(word.charAt(0)).append(" ");
        //     }
        //     else{
        //         result.append(word).append(" ");
        //     }
        // }
        // return result.toString().trim();

        // reverse complete string;
        
            for (String word : words) {
                StringBuilder reversedWord = new StringBuilder(word);   
                reversedWord.reverse();
                result.append(reversedWord).append(" ");
            }
    
            return result.toString().trim();
        }
    }



