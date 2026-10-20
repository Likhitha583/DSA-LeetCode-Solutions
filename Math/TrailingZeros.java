class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;
        while (n >= 5) {
            cnt += n / 5;
            n /= 5;
        }
        return cnt;
    }
}

// Problem: Factorial Trailing Zeroes
// Problem Link: https://leetcode.com/problems/factorial-trailing-zeroes/
// Approach: Count the factors of 5 in n! by repeatedly adding n / 5 and dividing n by 5 until n < 5.
// Time Complexity: O(log₅ n)
// Space Complexity: O(1)
