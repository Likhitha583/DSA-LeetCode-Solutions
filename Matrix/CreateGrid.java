class Solution {
    public String[] createGrid(int m, int n) {
        String[] res = new String[m];
        for (int i = 0; i < m - 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append('.');
            for (int j = 1; j < n; j++) {
                sb.append('#');
            }
            res[i] = sb.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++)
            sb.append('.');
        res[m - 1] = sb.toString();
        return res;
    }
}

// Problem: Create Grid With Exactly One Path
// Problem Link: https://leetcode.com/problems/create-grid-with-exactly-one-path/
// Approach: Create m strings of length n. Fill the first m - 1 rows with . at the beginning and # in the remaining positions, then fill the last row entirely with ..
// Time Complexity: O(m × n)
// Space Complexity: O(m × n) for the output array.
