class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s = 0, n = nums.length ;
        double maxSum = 0;
        for (int i = 0; i < k; i++)
            s += nums[i];
        maxSum = s;
        for (int i = k; i < n; i++) {
            s += nums[i] - nums[i - k];
            maxSum = Math.max(s, maxSum);
        }
        return maxSum / k;
    }
}

// Problem: Maximum Average Subarray I
// Problem Link: https://leetcode.com/problems/maximum-average-subarray-i/
// Approach: Use a sliding window of size k, update the window sum by adding the new element and 
// removing the outgoing element, and keep track of the maximum sum.
// Time Complexity: O(n)
// Space Complexity: O(1)
