import java.util.*;
public class substrfind {



    public static int findOccurrence(String str, String substr) {
        if (substr.length() > str.length()) return -1;
        // for (int i = 0; i <= str.length() - substr.length(); i++) {
        //     boolean match = true;
        //     for (int j = 0; j < substr.length(); j++) {
        //         if (str.charAt(i + j) != substr.charAt(j)) {
        //             match = false;
        //             break;
        //         }
        //     }
        //     if (match) return i;
        // }
        // return -1;

        return str.indexOf(substr);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String str = sc.nextLine();
        System.out.print("Enter the substring: ");
        String substr = sc.nextLine();
        int index = findOccurrence(str, substr);
        if (index != -1) {
            System.out.println("Substring found at index: " + index);
        } else {
            System.out.println("Substring not found");
        }
    }
}



