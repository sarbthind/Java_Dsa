// package string;
import java.util.Scanner;

public class revstrt2 {
    public static void main(String[] args) {
       
           
                Scanner scanner = new Scanner(System.in);
                
                System.out.println("Enter a string:");
                String input = scanner.nextLine();
                String[] word=input.split(" ");
                for(int i=0;i<word.length;i++){
                    word[i]=reverseword(word[i]);
                }     
                String result=String.join(" ",word);
                System.out.println("the reversed string is  "+ result);
                scanner.close();
           
    }
    public static String reverseword(String str){
        char[] characters=str.toCharArray();
        int left=0;
        int right=characters.length-1;
        while(left<right){
            char temp=characters[left];
            characters[left]=characters[right];
            characters[right]=temp;
            left++;
            right--;
        }
        return new String(characters);
    }
}
