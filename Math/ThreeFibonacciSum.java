class Solution {
    public boolean threeFibonacciSum(int n) {
        long a = 0, b = 1, c = 1;
        while (a + b + c <= n) {
            if (a + b + c == n)
                return true;
            long t = b + c;
            a = b;
            b = c;
            c = t;
        }
        return false;
    }
}

// Problem: Three Fibonacci Sum
// Problem Link: https://leetcode.com/contest/problems/three-fibonacci-sum/
// Approach: Use a Three-Pointer Fibonacci Sequence approach. Initialize a = 0, b = 1, and c = 1 as three consecutive Fibonacci numbers. Check whether their sum equals n; if not, generate the next Fibonacci number and shift the pointers forward. Stop when the sum exceeds n.
// Time Complexity: O(log n) — the Fibonacci numbers grow exponentially, so only O(log n) iterations are needed.
// Space Complexity: O(1) — only three variables are used.
