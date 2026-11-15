class Solution {
    public int countConsistent(int[] nums) {
        int n = nums.length, ba = 0, cnt = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ba = nums[i];
            min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                ba &= (nums[j]);
                min = Math.min(min, nums[j]);
                if (ba == min)
                    cnt++;
            }
        }
        return cnt;
    }
}

// Problem: Count Consistent Subarrays I
// Problem Link: https://leetcode.com/problems/count-consistent-subarrays-i/
// Approach: Use nested loops to generate all subarrays. Maintain the bitwise AND and minimum element of each subarray. If both are equal, increment the count.
// Time Complexity: O(n²)
// Space Complexity: O(1)
