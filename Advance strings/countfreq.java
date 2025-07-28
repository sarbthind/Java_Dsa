import java.util.*;

class CountFreq {
    public static void countFrequency(String s, int[] freq) {
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
    }

    public static void main(String[] args) {
        String s = "sarab";
        int[] freq = new int[256];
        countFrequency(s, freq);

        Set<Character> printed = new HashSet<>(); // to avoid printing same char multiple times

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!printed.contains(c)) {
                System.out.println(c + " : " + freq[c]);
                printed.add(c);
            }
        }
    }

    // import java.util.*;

// class CountFreq {
//     public static void main(String[] args) {
//         String s = "sarab";
//         LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

//         for (char c : s.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " : " + entry.getValue());
//         }
//     }
// }

}
