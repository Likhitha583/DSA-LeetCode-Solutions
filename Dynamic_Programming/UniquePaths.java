class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                dp[i][j] = -1;
        }
        return noofways(dp, m - 1, n - 1);
    }

    public int noofways(int[][] dp, int m, int n) {
        if (m == 0 && n == 0)
            return 1;
        if (m < 0 || n < 0)
            return 0;
        if (dp[m][n] != -1)
            return dp[m][n];
        return dp[m][n] = noofways(dp, m - 1, n) + noofways(dp, m, n - 1);
    }
}

// Problem: Unique Paths
// Problem Link: https://leetcode.com/problems/unique-paths/
// Approach: Use Top-Down Dynamic Programming (Memoization). Start from the bottom-right cell and recursively move up or left. If we reach (0,0), there is one valid path. Invalid positions return 0. Store each computed result in dp[m][n] to avoid repeated calculations.
// Time Complexity: O(m × n) — each cell is computed only once.
// Space Complexity: O(m × n) for the DP table + O(m + n) recursion stack. Overall: O(m × n).
