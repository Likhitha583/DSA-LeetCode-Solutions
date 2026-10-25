class Solution {
    int cntset(int n) {
        int cnt = 0;
        while (n > 0) {
            cnt++;
            n = n & (n - 1);
        }
        return cnt;
    }

    public int calculateScore(int a, int b) {
        int s1 = cntset(a);
        int s2 = cntset(b);
        if (s1 >= s2)
            return s1 * s2;
        return s2 / s1;
    }
}

// Problem: Binary Digit Score
// Problem Link: https://leetcode.com/problems/binary-digit-score/
// Approach: Count the set bits in a and b using Brian Kernighan’s algorithm (n & (n - 1)). If s1 >= s2, return their product; otherwise, return s2 / s1.
// Time Complexity: O(log a + log b)
// Space Complexity: O(1)
