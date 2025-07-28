import java.util.*;

public class FirstSubsequenceWithSumK {

    public static boolean findSubsequence(int[] arr, int index, int sum, int k, List<Integer> current) {
        if (index == arr.length) {
            if (sum == k) {
                System.out.println("Subsequence: " + current);
                return true; // found
            }
            return false;
        }
        // Include current element
        current.add(arr[index]);
        if (findSubsequence(arr, index + 1, sum + arr[index], k, current)) return true;
        // Exclude current element (backtrack)
        current.remove(current.size() - 1);
        if (findSubsequence(arr, index + 1, sum, k, current)) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        List<Integer> current = new ArrayList<>();

        boolean found = findSubsequence(arr, 0, 0, k, current);

        if (!found) {
            System.out.println("No such subsequence found.");
        }
    }
}
