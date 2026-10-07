class Solution {
    List<List<Integer>> res = new ArrayList<>();
    void help(int[] nums, ArrayList arr, boolean[] vis, int i) {
        if (i == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }
        for (int j = 1; j <= nums.length; j++) {
            if (!vis[j]) {
                vis[j] = true;
                arr.add(nums[j - 1]);
                help(nums, arr, vis, i + 1);
                arr.remove(arr.size() - 1);
                vis[j] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        res.clear();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] vis = new boolean[nums.length + 1];
        help(nums, arr, vis, 0);
        return res;
    }
}

// Problem: Permutations
// Problem Link: https://leetcode.com/problems/permutations/
// Approach: Use Backtracking with a visited array. At each position, try every unused element, add it to the current permutation, mark it as visited, and recursively fill the next position. After returning, remove the element and unmark it to try another possibility.
// Time Complexity: O(n × n!) — there are n! permutations, and copying each permutation into res takes O(n).
// Space Complexity: O(n × n!) — for storing all permutations, plus O(n) for the recursion stack, arr, and vis.
