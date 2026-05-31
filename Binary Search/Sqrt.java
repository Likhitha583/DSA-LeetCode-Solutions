class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int left = 1, right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;  
    }
}

// Problem: Sqrt(x)
// Problem Link: https://leetcode.com/problems/sqrtx/
// Approach: Using Binary Search to find the integer square root.
// If mid > x / mid, search in the left half, otherwise search in the right half.
// Time Complexity: O(log x)
// Space Complexity: O(1)
