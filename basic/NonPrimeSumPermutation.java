import java.util.*;

public class NonPrimeSumPermutation {
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    // Function to check if current permutation is valid
    static boolean isValid(List<Integer> current) {
        for (int i = 0; i < current.size() - 1; i++) {
            if (isPrime(current.get(i) + current.get(i + 1))) {
                return false;
            }
        }
        return true;
    }
    
    // Function to find valid permutation using backtracking
    static List<Integer> findValidPermutation(int n) {
        List<Integer> result = new ArrayList<>();
        boolean[] used = new boolean[n + 1];
        
        if (backtrack(n, result, used)) {
            return result;
        }
        return null;
    }
    
    static boolean backtrack(int n, List<Integer> current, boolean[] used) {
        // If we've placed all numbers and it's valid, we've found a solution
        if (current.size() == n) {
            return isValid(current);
        }
        
        // Try placing each unused number
        for (int i = 1; i <= n; i++) {
            if (!used[i]) {
                // Skip if adding this number would create a prime sum with previous number
                if (!current.isEmpty() && 
                    isPrime(current.get(current.size() - 1) + i)) {
                    continue;
                }
                
                current.add(i);
                used[i] = true;
                
                if (backtrack(n, current, used)) {
                    return true;
                }
                
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 6;
        List<Integer> result = findValidPermutation(n);
        
        if (result != null) {
            System.out.println("Found valid permutation: " + result);
            // Verify the solution
            System.out.println("\nVerifying adjacent sums:");
            for (int i = 0; i < result.size() - 1; i++) {
                int sum = result.get(i) + result.get(i + 1);
                System.out.printf("%d + %d = %d (Prime: %b)%n", 
                    result.get(i), result.get(i + 1), sum, isPrime(sum));
            }
        } else {
            System.out.println("No valid permutation found");
        }
    }
}