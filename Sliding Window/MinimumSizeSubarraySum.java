class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE, n = nums.length, sum = 0, l = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum >= target) {
                while (sum >= target) {
                    minlen = Math.min(i - l + 1, minlen);
                    sum -= nums[l++];
                }
            }  
        }
        if (minlen == Integer.MAX_VALUE)
            return 0;
        return minlen;
    }
}

// Problem: Minimum Size Subarray Sum
// Problem link: https://leetcode.com/problems/minimum-size-subarray-sum/
// Approach: Maintain a sliding window and keep expanding it until the sum becomes greater than or equal to the target.
// Once sum >= target, keep shrinking the window from the left while the condition remains true, updating the minimum length at each step.
// After processing the entire array, return the minimum length found. If no valid subarray exists, return 0.
// Time Complexity: O(n)
// Space Complexity: O(1)
