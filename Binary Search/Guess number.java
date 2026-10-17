public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n, mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            int r = guess(mid);
            if (r == 0)
                return mid;
            else if (r == 1)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}

// Problem: Guess Number Higher or Lower
// Problem Link: https://leetcode.com/problems/guess-number-higher-or-lower/
// Approach: Use binary search on the range [1, n]. If guess(mid) == 1, search the right half; if guess(mid) == -1, search the left half; if 0, return mid.
// Time Complexity: O(log n)
// Space Complexity: O(1)
