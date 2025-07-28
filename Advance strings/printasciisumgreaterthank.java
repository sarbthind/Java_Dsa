public class printasciisumgreaterthank {
    public static void printAsciiSumGreaterThanK(String s, int index, String current, int sum, int k) {
        if (index == s.length()) {
            if (sum > k) {
                System.out.println(current + " -> ASCII Sum: " + sum);
            }
            return;
        }

        // Take the character
        printAsciiSumGreaterThanK(s, index + 1, current + s.charAt(index), sum + s.charAt(index), k);

        // Not take the character
        printAsciiSumGreaterThanK(s, index + 1, current, sum, k);
    }

    public static void main(String[] args) {
        String s = "abc";
        int k = 195;  // ASCII: a=97, b=98, c=99

        System.out.println("Subsequences with ASCII sum > " + k + ":");
        printAsciiSumGreaterThanK(s, 0, "", 0, k);
       
    }
}


