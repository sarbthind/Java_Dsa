// package string;
import java.util.*;

public class checkascending  { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

//    String input = sc.nextLine(); 

        String input = "Ja1va 3is5 a77 p9ow23er25ful pro29gram35ming language"; 

        boolean output = checkSequence(input); 

        if (output == true) { 

            System.out.println("Series is in ascending order"); 

        } else { 

            System.out.println("Not n order"); 

        } 

    } 

 

    private static boolean checkSequence(String input) { 

        String[] words = input.split("[^1-9]+"); 

//        System.out.println(Arrays.toString(words)); 

        for (int i = 1; i < words.length; i++) { 

            if (words[i].length() == 0 || words[i - 1].length() == 0) { 

                continue; 

            } 

            if (Integer.valueOf(words[i]) < Integer.valueOf(words[i - 1])) { 

                return false; 

            } 

        } 

        return true; 

    } 

 

} 

 

