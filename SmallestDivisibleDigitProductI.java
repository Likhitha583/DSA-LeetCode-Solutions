class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int num = n, k = 1;
            while (num > 0) {
                k *= (num % 10);
                num /= 10;
            }
            if (k % t == 0)
                return n;
            n++;
        }
    }
}

// Problem: Smallest Divisible Digit Product I
// Problem Link: https://leetcode.com/problems/smallest-divisible-digit-product-i/
// Approach: Starting from n, repeatedly compute the product of its digits. If the product is divisible by t, return the current number; otherwise, increment n and continue searching.
// Time Complexity: O(k × d), where k is the number of numbers checked and d is the number of digits in each number.
// Space Complexity: O(1)
