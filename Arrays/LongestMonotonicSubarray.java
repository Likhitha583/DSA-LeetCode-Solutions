class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int i = 1, len = 1, in = 1, d = 1;
        while (i < nums.length) {
            if (nums[i - 1] < nums[i]) {
                in++;
                d = 1;
            } else if (nums[i - 1] > nums[i]) {
                d++;
                in = 1;
            } else {
                in = 1;
                d = 1;
            }
            len = Math.max(len, Math.max(in, d));
            i++;
        }
        return len;
    }
}

// Problem: Longest Strictly Increasing or Strictly Decreasing Subarray
// Problem Link: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
// Approach: Traverse the array while maintaining the lengths of the current strictly increasing (in) and strictly decreasing (d) subarrays. Reset the opposite counter when the trend changes and both counters when adjacent elements are equal. Update the maximum length at each step.
// Time Complexity: O(n)
// Space Complexity: O(1)
