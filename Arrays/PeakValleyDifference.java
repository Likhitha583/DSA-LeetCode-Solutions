 class Solution {
    public int peakValleyDifference(int[] nums) {
        int p = 0, v = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1])
                v += nums[i];
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1])
                p += nums[i];
        }
        return p - v;
    }
}

// Problem: Difference Between Peaks and Valleys
// Problem Link: https://leetcode.com/problems/difference-between-peaks-and-valleys/
// Approach: Traverse the array from index 1 to n - 2. Add each local maximum (peak) to p and each local minimum (valley) to v, then return p - v.
// Time Complexity: O(n)
// Space Complexity: O(1)
