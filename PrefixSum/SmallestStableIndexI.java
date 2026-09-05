class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];
        min[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            min[i] = Math.min(nums[i], min[i + 1]);
        }
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (max - min[i] <= k)
                return i;
        }
        return -1;
    }
}

// Problem: Smallest Stable Index I
// Problem Link: https://leetcode.com/problems/smallest-stable-index-i/
// Approach: Use Prefix Maximum + Suffix Minimum. First, build a min[] array where min[i] stores the minimum value from index i to the end. Then traverse from left to right while maintaining the maximum value from 0 to i. For each index, if max - min[i] <= k, that index is the first stable index, so return it.
// Time Complexity: O(n) — two linear traversals.
// Space Complexity: O(n) — for the min[] array.
