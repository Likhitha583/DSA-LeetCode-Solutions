class Solution {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                cnt++;
                if (cnt > 1)
                    return false;
                if (i == 1 || nums[i - 2] <= nums[i])
                    nums[i - 1] = nums[i];
                else
                    nums[i] = nums[i - 1];
            }
        }
        return true;
    }
}

// Problem: Non-decreasing Array
// Problem Link: https://leetcode.com/problems/non-decreasing-array/
// Approach: Traverse the array and count adjacent decreasing pairs. If more than one is found, return false; otherwise, modify either the previous or current element to maintain non-decreasing order.
// Time Complexity: O(n)
// Space Complexity: O(1)
