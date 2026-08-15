class Solution {
    public int longestSubsequence(int[] nums) {
        int len = 0, k = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) 
                len++;
            k = k ^ nums[i];
        }
        if(k != 0)
            return nums.length;
        else if(k==0 && len >= nums.length-1)
            return 0;
        return nums.length-1;
    }
}

// Problem: Longest Subsequence With Non-Zero Bitwise XOR
// Problem Link: https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/
// Approach: Compute the XOR of all elements and count the zeros. If the total XOR is non-zero, the entire array is valid. If the XOR is zero, remove one non-zero element; if all elements are zero, return 0.
// Time Complexity: O(n)
// Space Complexity: O(1)
