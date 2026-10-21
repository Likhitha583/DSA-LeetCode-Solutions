class Solution {
    public int countPrimes(int n) {
        if (n <= 1)
            return 0;
        int cnt = 0;
        boolean[] b = new boolean[n + 1];
        Arrays.fill(b, true);
        for (int i = 2; i * i < n; i++) {
            if (b[i] == true) {
                for (int j = i * i; j < n; j = j + i)
                    b[j] = false;
            }
        }
        for (int i = 2; i < n; i++)
            if (b[i])
                cnt++;
        return cnt;
    }
}

// Problem: Count Primes
// Problem Link: https://leetcode.com/problems/count-primes/
// Approach: Use the Sieve of Eratosthenes. Initially mark all numbers as prime, then mark multiples of each prime starting from i * i as non-prime and count the remaining primes less than n.
// Time Complexity: O(n log log n)
// Space Complexity: O(n)
