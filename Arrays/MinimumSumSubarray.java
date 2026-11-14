class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size(), s = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            s = 0;
            for (int j = i; j < n; j++) {
                s += nums.get(j);
                if (s > 0 && ((j - i + 1) >= l && (j - i + 1) <= r))
                    min = Math.min(min, s);
            }
        }
        return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}

// Problem: Minimum Positive Sum Subarray 
// Problem Link: https://leetcode.com/problems/minimum-positive-sum-subarray/
// Approach: Use nested loops to generate all possible subarrays and maintain their running sum. If the subarray length is between l and r and its sum is positive, update the minimum sum.
// Time Complexity: O(n²)
// Space Complexity: O(1)
