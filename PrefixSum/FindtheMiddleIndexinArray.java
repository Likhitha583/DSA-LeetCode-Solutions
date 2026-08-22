class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length, ls = 0, sum = 0;
        for (int i = 0; i < n; i++)
            sum += nums[i];
        for (int i = 0; i < n; i++) {
            if (ls == sum - ls - nums[i])
                return i;
            ls += nums[i];
        }
        return -1;
    }
}

// Problem: Find the Middle Index in Array
// Problem Link: https://leetcode.com/problems/find-the-middle-index-in-array/
// Approach: First calculate the total sum of the array, then traverse it while maintaining the left sum. At each index, compare leftSum with totalSum - leftSum - nums[i] (right sum).
// Time Complexity: O(n) (two linear traversals)
// Space Complexity: O(1).
