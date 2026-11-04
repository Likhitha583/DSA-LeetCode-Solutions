class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length - 1, high = n, low = 0, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (mid < n && mid > 0 && arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > 0 && arr[mid - 1] > arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}

// Problem: Peak Index in a Mountain Array
// Problem Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Approach: Use binary search to find the peak element. If the middle element is greater than both neighbors, return its index. If the left neighbor is greater, search the left half; otherwise, search the right half.
// Time Complexity: O(log n)
// Space Complexity: O(1)
