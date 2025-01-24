// package string;

import java.util.*;

public class reversestringwithoutnumber {
    

       
            public static String reverseBeforeNumbers(String input) {
                StringBuilder result = new StringBuilder();
                StringBuilder currentWord = new StringBuilder();
                
                for (char c : input.toCharArray()) {
                    if (Character.isDigit(c)) {
                        result.append(currentWord.reverse());
                        currentWord.setLength(0);
                        result.append(c);
                    } else {
                        currentWord.append(c);
                    }
                }
                
                // Append any remaining characters
                result.append(currentWord.reverse());
                
                return result.toString();
            }
        
            public static void main(String[] args) {
                String input = "sarb12raj3";
                String reversed = reverseBeforeNumbers(input);
                System.out.println("Original: " + input);
                System.out.println("Reversed: " + reversed);
            
        


    }
}
