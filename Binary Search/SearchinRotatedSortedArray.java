class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = -1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[low] <= nums[mid]) {
                if (nums[mid] > target && nums[low] <= target)
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            else {
                if (nums[mid] < target && nums[high] >= target)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }
}

// Problem: Search in Rotated Sorted Array
// Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
// Approach: Find which half of the rotated sorted array is properly sorted, then apply Binary Search on the valid half containing the target.
// Time Complexity: O(log N) due to Binary Search reducing the search space by half each time.
// Space Complexity: O(1) as only constant extra variables are used.
