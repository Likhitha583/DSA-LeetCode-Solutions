class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int s = nums[0];
        for(int i = 1; i < nums.length; i++){
            s = Math.max(nums[i], s + nums[i]);
            max = Math.max(max,s);
        }
        return max;
    }
}

// Problem: Maximum Subarray
// Problem Link: https://leetcode.com/problems/maximum-subarray/
// Approach: Kadane's algorithm utilizing dynamic programming to track maximum subarray sum ending at each position.
// Time Complexity: O(N) Traverses the entire array of length N once.
// Space Complexity: O(1) No extra space used.
