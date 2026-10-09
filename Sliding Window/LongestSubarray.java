class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length, i = 0, j = 0, l = 0, z = 0;
        while (i < n) {
            if (nums[i] == 0)
                z++;
            while (z > 1) {
                if (nums[j] == 0)
                    z--;
                j++;
            }
            l = Math.max(l, i - j);
            i++;
        }
        return l;
    }
}

// Problem: Longest Subarray of 1's After Deleting One Element
// Problem Link: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
// Approach: Use a Sliding Window to find the longest subarray containing at most one zero. Expand the window using i and count zeros in z. If the window contains more than one zero, move j forward until only one zero remains. Update l with i - j because one element must be deleted from the subarray.
// Time Complexity: O(n) — each pointer traverses the array at most once.
// Space Complexity: O(1) — only a few variables are used.
