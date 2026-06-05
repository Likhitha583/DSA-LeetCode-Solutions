/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (isBadVersion(mid))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}

// Problem: First Bad Version
// Problem Link: https://leetcode.com/problems/first-bad-version/
// Approach: Binary Search
// Time Complexity: O(log n)
// Space Complexity: O(1)
