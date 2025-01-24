import java.util.Arrays;

public class ratinamaze {
    public static int helper(int maze[][], int sr, int sc, int er, int ec, int[][] dp) {
        // Out-of-bounds or blocked cell check
        if (sr < 0 || sc < 0 || sr > er || sc > ec || maze[sr][sc] == -1) {
            return 0;
        }
        // Base case: Reached the destination
        if (sr == er && sc == ec) {
            return 1;
        }
        // Use precomputed result if available
        if (dp[sr][sc] != -1) {
            return dp[sr][sc];
        }
        // Recursive computation: Down and Right
        int down = helper(maze, sr + 1, sc, er, ec, dp);
        int right = helper(maze, sr, sc + 1, er, ec, dp);
        // Memoize the result for the current cell
        dp[sr][sc] = down + right;
        return dp[sr][sc];
    }
    public static int solveMaze(int maze[][]) {
        int sr = 0;
        int sc = 0;
        int er = maze.length - 1;
        int ec = maze[0].length - 1;
        // Edge case: If start or end is blocked
        if (maze[sr][sc] == -1 || maze[er][ec] == -1) {
            return 0;
        }
        // Initialize dp array with -1
        int[][] dp = new int[maze.length][maze[0].length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        // Call the helper function
        return helper(maze, sr, sc, er, ec, dp);
    }
//     0 -1 -1 -1
//     0  0 -1 -1
//    -1  0  0 -1
//    -1  0  0  0
    public static void main(String[] args) {
        int[][] maze={
            {0,-1,-1,-1},
            {0,0,-1,-1},
            {-1,0,0,-1},
            {-1,0,0,0}
        };
        int ans=solveMaze(maze);
        System.out.println(ans);
    }

}
