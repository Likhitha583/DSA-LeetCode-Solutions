class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length - 2; i++) {
            max = Math.max(max, nums[i]);
            if (max > nums[i + 2])
                return false;
        }
        return true;
    }
}

// Problem: Global and Local Inversions
// Problem Link: https://leetcode.com/problems/global-and-local-inversions/
// Approach: Maintain the maximum element seen so far up to index i. If this maximum is greater than nums[i + 2], a global inversion exists that is not a local inversion, so return false.
// Time Complexity: O(n)
// Space Complexity: O(1)
