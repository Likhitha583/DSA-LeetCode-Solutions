class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1, mid;
        while (low < high) {
            mid = low + (high - low) / 2;
            if (nums[mid] > nums[high])
                low = mid + 1;
            else
                high = mid;
        }
        return nums[low];
    }
}

// Problem: Find Minimum in Rotated Sorted Array
// Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Approach: Use binary search to find the rotation point; the minimum element is where the sorted order breaks.
// Time Complexity: O(logN)
// Space Complexity: O(1)
