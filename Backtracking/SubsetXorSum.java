class Solution {
    int res = 0;
    void subset(int[] nums, int i, int xor) {
        if (i == nums.length) {
            res += xor;
            return;
        }
        subset(nums, i + 1, xor ^ nums[i]);
        subset(nums, i + 1, xor);
    }
    public int subsetXORSum(int[] nums) {
        subset(nums, 0, 0);
        return res;
    }
}

// Problem: Sum of All Subset XOR Totals
// Problem Link: https://leetcode.com/problems/sum-of-all-subset-xor-totals/
// Approach: Use Backtracking to generate every possible subset. At each index, there are two choices: include nums[i] in the current XOR or exclude it. When all elements are processed, add the resulting XOR to res.
// Time Complexity: O(2ⁿ) — there are 2ⁿ subsets, and each subset takes O(1) work at the leaf.
// Space Complexity: O(n) — recursion depth is at most n.
