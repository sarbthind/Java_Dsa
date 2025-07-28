import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MinSubsequenceSumK {
     public static void solve(int[] arr, int index, int sum, int target,List<Integer> current, List<List<Integer>> result, int[] minSize) {
        if (index == arr.length) {
            if (sum == target) {
                if (current.size() < minSize[0]) {
                    minSize[0] = current.size();
                    result.clear(); // clear old longer results
                    result.add(new ArrayList<>(current));
                } else if (current.size() == minSize[0]) {
                    result.add(new ArrayList<>(current));
                }
            }
            return;
        }
        // Include current element
        current.add(arr[index]);
        solve(arr, index + 1, sum + arr[index], target, current, result, minSize);
        current.remove(current.size() - 1);
        // Exclude current element
        solve(arr, index + 1, sum, target, current, result, minSize);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Size of array
        int target = sc.nextInt();  // Target sum
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        List<List<Integer>> result = new ArrayList<>();
        int[] minSize = {Integer.MAX_VALUE};
        
        solve(arr, 0, 0, target, new ArrayList<>(), result, minSize);
        
        System.out.println("Subsequences with min elements that sum to " + target + ":");
        for(List<Integer> seq : result) {
            System.out.println(seq);
        }
        sc.close();
    }
    
}