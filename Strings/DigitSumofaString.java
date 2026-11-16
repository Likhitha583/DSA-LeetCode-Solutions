class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i += k) {
                int sum = 0;
                for (int j = i; j < Math.min(i + k, s.length()); j++) {
                    sum += s.charAt(j) - '0';
                }
                sb.append(sum);
            }
            s = sb.toString();
        }
        return s;
    }
}

// Problem: Calculate Digit Sum of a String
// Problem Link: https://leetcode.com/problems/calculate-digit-sum-of-a-string/
// Approach: Repeatedly divide the string into groups of k digits, calculate each group's digit sum, and build a new string using those sums. Continue until the string length is at most k.
// Time Complexity: O(n logₖ n)
// Space Complexity: O(n) (for the StringBuilder).
