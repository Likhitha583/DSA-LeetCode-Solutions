class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length, result = 0;
        long sum = 0, leftsum = 0;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        for (int i = 0; i < n - 1; i++) {
            leftsum += nums[i];
            if (leftsum >= sum - leftsum)
                result++;
        }
        return result;
    }
}

// Problem: Number of Ways to Split Array
// Problem Link: https://leetcode.com/problems/number-of-ways-to-split-array/
// Approach: First calculate the total sum of the array, then traverse up to n-2 while maintaining the left sum. For each split, compare leftsum with sum - leftsum (right sum) and count valid splits.
// Time Complexity: O(n)
// Space Complexity: O(1)
