class Solution {
    public boolean isUgly(int n) {
        if (n <= 0)
            return false;
        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;
        return n == 1;
    }
}

// Problem: Ugly Number 
// Problem Link: https://leetcode.com/problems/ugly-number/
// Approach: Repeatedly divide n by its only allowed prime factors 2, 3, and 5. If the remaining value becomes 1, the number is an ugly number; otherwise, it contains another prime factor.
// Time Complexity: O(log n)
// Space Complexity: O(1)
