class Solution {
    public int minCost(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Set<Integer>[][] dp = new HashSet[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = new HashSet<>();
                if (i == 0 && j == 0) {
                    dp[i][j].add(grid[i][j]);
                    continue;
                }
                if (i > 0) {
                    for (int x : dp[i - 1][j])
                        dp[i][j].add(x ^ grid[i][j]);
                }
                if (j > 0) {
                    for (int x : dp[i][j - 1])
                        dp[i][j].add(x ^ grid[i][j]);
                }
            }
        }
        return Collections.min(dp[m - 1][n - 1]);
    }
}

// Problem: Minimum XOR Path in a Grid
// Problem Link: https://leetcode.com/problems/minimum-xor-path-in-a-grid/
// Approach: Use dynamic programming with a HashSet at each cell to store all distinct XOR values achievable by paths from (0,0) to that cell. For each cell, XOR its value with every possible XOR from the top and left cells, then return the minimum XOR at the destination.
// Time Complexity: O(m × n × K) on average, where K is the maximum number of distinct XOR values stored in a cell.
// Space Complexity: O(m × n × K) to store the sets of distinct XOR values for all cells.
