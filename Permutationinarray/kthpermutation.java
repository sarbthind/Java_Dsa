import java.util.ArrayList;
import java.util.List;

// 🧠 Time Complexity:

//     O(n^2) → Because removing from list is O(n) and we do it n times.

public class kthpermutation {
       public static String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;
        
        // Build initial list [1, 2, ..., n] and calculate n!
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
            fact *= i;
        }

        k--; // Important: convert to 0-based index

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            fact /= (n - i); // Reduce factorial for remaining elements
            int index = k / fact; // Choose index
            result.append(numbers.get(index)); // Pick the digit
            numbers.remove(index); // Remove from list
            k %= fact; // Update k
        }

        return result.toString();
    }

    public static void main(String[] args) {
        int n = 3, k = 3;
        String ans = getPermutation(n, k);
        System.out.println("K-th permutation: " + ans);
    }
}
