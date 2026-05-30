class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, m, high = nums.length - 1;
        while (l <= high) {
            m = (l + high) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                high = m - 1;
            } else {
                l = m + 1;
            }

        }
        return l;
    }
}

// Problem: Search Insert Position
// Problem Link: https://leetcode.com/problems/search-insert-position/
// Approach: Use Binary Search to find the target; if not found, return the position where it should be inserted.
// Time Complexity: O(logN) for searching the target element in sorted array.
// Space Complexity: O(1) No extra space is needed.
