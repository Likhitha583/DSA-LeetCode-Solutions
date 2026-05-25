class Solution {
    public int maxArea(int[] height) {
        int res = 0, i = 0, j = height.length - 1;
        while (i < j) {
            res = Math.max(res, (Math.min(height[i], height[j]) * (j - i)));
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return res;
    }
}

// Problem: Container With Most Water
// Problem Link: https://leetcode.com/problems/container-with-most-water/
// Approach: Two Pointer - Place one pointer at 0 and another at last. 
// After calculating area between i and j pointers ,move the pointer which has least height.
// Time Complexity: O(N) - Traverses the entire array once.
// Space Complexity: O(1) - No extra space is used.
