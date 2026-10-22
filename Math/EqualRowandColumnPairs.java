class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length, res = 0;
        HashMap<ArrayList<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(grid[i][j]);
            }
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(grid[j][i]);
            }
            if (map.containsKey(a))
                res += map.get(a);
        }
        return res;
    }
}

// Problem: Equal Row and Column Pairs
// Problem Link: https://leetcode.com/problems/equal-row-and-column-pairs/
// Approach: Store each row as an ArrayList in a HashMap with its frequency. Then compare each column with the stored rows and add the row frequency whenever they match.
// Time Complexity: O(n²) average
// Space Complexity: O(n²) for storing all rows in the HashMap.
