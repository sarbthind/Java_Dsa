import java.util.*;
public class allsubstringofastringusingrecursion {
    public static void collectSubstrings(String s, int start, int end, List<String> list) {
        if (end > s.length()) return;

        if (start == end) {
            collectSubstrings(s, 0, end + 1, list); // move to next window length
        } else {
            list.add(s.substring(start, end));     // 🧠 Store in list instead of print
            collectSubstrings(s, start + 1, end, list);
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        List<String> substrings = new ArrayList<>();

        collectSubstrings(s, 0, 1, substrings); // start from end=1

        // Print collected substrings
        for (String str : substrings) {
            System.out.println(str);
        }

        // Example operation: Find longest substring
      //  String longest = Collections.max(substrings, Comparator.comparingInt(String::length));
      //  System.out.println("Longest: " + longest);


//       for (int i = 0; i < s.length(); i++) {
//          for (int j = i + 1; j <= s.length(); j++) {
//         System.out.println(s.substring(i, j));
//     }
// }

    }
}

