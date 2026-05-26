class Solution {
    public int maxProduct(int[] nums) {
        int Max = nums[0], Min = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = Max;
                Max = Min;
                Min = temp;
            }
            Max = Math.max(nums[i], Max * nums[i]);
            Min = Math.min(nums[i], Min * nums[i]);
            ans = Math.max(Max, ans);
        }
        return ans;
    }
}

// Problem: Maximum Product Subarray
// Problem Link: https://leetcode.com/problems/maximum-product-subarray/
// Approach: Track both max and min products since negative numbers can flip signs. 
// Swap them when a negative element appears, update both states, and keep track of the global maximum.
// Time Complexity: O(N) traverses the entire only once where N is length of nums array.
// Space Complexity: O(1) No extra space is needed.
