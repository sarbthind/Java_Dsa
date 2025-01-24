

public class basic {
    public static void main(String[] args) { 

        // Creating strings 

        String str1 = "Hello"; 

        String str2 = new String("World"); 

        if(str1==str2){
            System.out.println("yes it works");
        }

        // Displaying strings 

        System.out.println("String 1: " + str1); 

        System.out.println("String 2: " + str2); 

 

        // Concatenating strings 

        String str3 = str1 + " " + str2; 

        System.out.println("Concatenated String: " + str3); 

 

        // Finding the length of a string 

        System.out.println("Length of str3: " + str3.length()); 

 

        // Accessing characters in a string 

        char ch = str3.charAt(6); 

        System.out.println("Character at index 6: " + ch); 

 

        // Extracting substrings 

        String substr = str3.substring(6, 11); 

        System.out.println("Substring from index 6 to 11: " + substr); 

 

        // Checking string equality 

        boolean isEqual = str1.equals("Hello"); 

        System.out.println("Is str1 equal to 'Hello'? " + isEqual); 

 

        // Converting to uppercase 

        String upperStr = str3.toUpperCase(); 

        System.out.println("Uppercase String: " + upperStr); 

 

        // Replacing characters 

        String replacedStr = str3.replace('o', '0'); 

        System.out.println("Replaced String: " + replacedStr); 

    }
}
