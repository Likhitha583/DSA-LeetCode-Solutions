class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}

// Problem: Binary Search 
// Problem Link: https://leetcode.com/problems/binary-search/
// Approach: Binary Search by repeatedly halving the search space based on comparison with the middle element.
// Time Complexity: O(log n) — the search range is reduced by half in each iteration.
// Space Complexity: O(1) — only a constant amount of extra space is used.
