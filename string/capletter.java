
import java.util.Scanner;
import java.util.*;

public class capletter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strr = str.split(" ");
        for (int i = 0; i < strr.length; i++) {
            strr[i] = capitalizeWord(strr[i]);
        }
        System.out.println(String.join(" ", strr));
        sc.close();
    }

    public static String capitalizeWord(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
