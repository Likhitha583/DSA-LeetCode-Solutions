class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0, n = arr.length;
        if (n < 3)
            return false;
        while (i < n - 1 && arr[i] < arr[i + 1])
            i++;
        if (i == n - 1 || i == 0)
            return false;
        while (i < n - 1 && arr[i] > arr[i + 1])
            i++;
        if (i == n - 1)
            return true;
        return false;
    }
}

// Problem: Valid Mountain Array
// Problem Link: https://leetcode.com/problems/valid-mountain-array/
// Approach: Traverse the array in two phases: first, move upward while elements are strictly increasing; then move downward while elements are strictly decreasing. Ensure the peak is neither the first nor the last element and the traversal reaches the end.
// Time Complexity: O(n)
// Space Complexity: O(1)
