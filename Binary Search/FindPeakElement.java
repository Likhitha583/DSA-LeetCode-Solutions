class Solution {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid > 0 && mid < nums.length - 1 && nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                return mid;
            else if (mid < nums.length - 1 && nums[mid] < nums[mid + 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}

// Problem: Find Peak Element 
// Problem Link: https://leetcode.com/problems/find-peak-element/
// Approach: Use binary search. If nums[mid] < nums[mid+1], a peak must exist on the right, so move low; otherwise, move high left. Boundary cases are handled by returning low.
// Time Complexity: O(log n)
// Space Complexity: O(1)
