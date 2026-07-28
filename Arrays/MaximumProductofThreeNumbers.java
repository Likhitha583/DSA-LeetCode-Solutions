class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;

        return Math.max(
            nums[0] * nums[1] * nums[n],
            nums[n] * nums[n - 1] * nums[n - 2]
        );
    }
}

// Problem: Maximum Product of Three Numbers
// Problem Link: https://leetcode.com/problems/maximum-product-of-three-numbers/
// Approach: Sort the array, then compute the maximum of (two smallest × largest) and (three largest)
// to handle both negative and positive number cases.
// Time Complexity: O(n log n) (sorting dominates)
// Space Complexity: O(1) (excluding the space used by the sorting algorithm).
