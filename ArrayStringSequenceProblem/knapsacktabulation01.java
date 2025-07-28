public class knapsacktabulation01 {
     public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};
        int[] values  = {1, 4, 5, 7};
        int maxWeight = 7;
        int n = weights.length;

        int[][] dp = new int[n][maxWeight + 1];

        // 1️⃣ Base Case: First row (only item 0 available)
        for (int w = 0; w <= maxWeight; w++) {
            if (weights[0] <= w) {
                dp[0][w] = values[0]; // If it fits, take it
            } else {
                dp[0][w] = 0; // Can't take
            }
        }

        // 2️⃣ Fill the table bottom-up
        for (int i = 1; i < n; i++) {
            for (int w = 0; w <= maxWeight; w++) {
                int notTake = dp[i - 1][w];
                int take = 0;
                if (weights[i] <= w) {
                    take = values[i] + dp[i - 1][w - weights[i]];
                }
                dp[i][w] = Math.max(take, notTake);
            }
        }

        // 3️⃣ Final Answer
        System.out.println("Max Value: " + dp[n - 1][maxWeight]);
    }
}

// | Approach         | What you build                          | Space     | Time      |
// | ---------------- | --------------------------------------- | --------- | --------- |
// | Recursion + Memo | Top-down → fills `dp[i][w]` as needed   | O(n \* W) | O(n \* W) |
// | Tabulation       | Bottom-up → fills full `dp[i][w]` table | O(n \* W) | O(n \* W) |
// | Space Optimized  | Use 1D dp array (next step)             | O(W)      | O(n \* W) |


// dp table of this code 
// weight->
// | i (item index) ↓ \ w (capacity) → | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
// | --------------------------------- | - | - | - | - | - | - | - | - |
// | 0 (only item 0)                   | 0 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
// | 1 (items 0,1)                     | 0 | 1 | 1 | 4 | 5 | 5 | 5 | 5 |
// | 2 (items 0-2)                     | 0 | 1 | 1 | 4 | 5 | 6 | 6 | 9 |
// | 3 (all items 0-3)                 | 0 | 1 | 1 | 4 | 5 | 7 | 8 | 9 |
// and table is filled with values

