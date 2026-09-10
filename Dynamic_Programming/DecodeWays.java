class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (s.charAt(0) == '0')
            return 0;
        int dp[] = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (s.charAt(i - 1) != '0')
                dp[i] += dp[i - 1];
            if (i - 2 >= 0) {
                int num = Integer.parseInt(s.substring(i - 2, i));
                if (num >= 10 && num <= 26)
                    dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}

// Problem: Decode Ways
// Problem Link: https://leetcode.com/problems/decode-ways/
// Approach: Use Dynamic Programming. dp[i] represents the number of ways to decode the first i characters. If the current digit is not 0, it can be decoded individually, so add dp[i-1]. Also, if the last two digits form a number between 10 and 26, they can be decoded together, so add dp[i-2]. A string starting with 0 is invalid.
// Time Complexity: O(n) — each character is processed once.
// Space Complexity: O(n) — for the dp array.
