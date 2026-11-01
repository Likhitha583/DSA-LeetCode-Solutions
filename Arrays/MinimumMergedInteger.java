class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i += 2) {
            String s = Integer.toString(nums[i]) + Integer.toString(nums[i + 1]);
            min = Math.min(min, Integer.parseInt(s));
        }
        return min;
    }
}

// Problem: Minimum Value of Merged Integers
// Problem Link: https://leetcode.com/problems/minimum-value-of-merged-integers/
// Approach: Traverse the array in pairs, concatenate each adjacent pair by converting them to strings, parse the concatenated value into an integer, and keep track of the minimum value.
// Time Complexity: O(n)
// Space Complexity: O(1) auxiliary space.
