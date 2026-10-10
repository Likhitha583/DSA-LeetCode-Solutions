class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1])
                    low = mid + 2;
                else
                    high = mid;
            } else {
                if (nums[mid] == nums[mid - 1])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return nums[low];
    }
}

// Problem: Single Element in a Sorted Array
// Problem Link: https://leetcode.com/problems/single-element-in-a-sorted-array/
// Approach: Use Binary Search on the sorted array. The single element disrupts the normal pairing pattern: before it, pairs start at even indices; after it, pairs start at odd indices. If mid is even and matches mid + 1, move low to mid + 2; otherwise, search the left half. If mid is odd and matches mid - 1, move low to mid + 1; otherwise, search the left half. Continue until low == high, which points to the single element.
// Time Complexity: O(log n) — binary search halves the search space each iteration.
// Space Complexity: O(1) — only a few variables are used.
