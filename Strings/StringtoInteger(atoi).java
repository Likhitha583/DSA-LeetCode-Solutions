class Solution {
    public int myAtoi(String s) {
        int n = s.length(), i = 0, sign = 1, result = 0;
        while (i < n && s.charAt(i) == ' ')
            i++;
        if (i < n && ((s.charAt(i) == '-') || (s.charAt(i) == '+'))) {
            if (s.charAt(i++) == '-')
                sign = -1;
        }
        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9')

        {
            if (result > Integer.MAX_VALUE / 10 ||
                    (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7))
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = (result * 10) + (s.charAt(i) - '0');
            i++;
        }
        return (sign == 1) ? result : result * -1;
    }
}

// Problem: String to Integer (atoi)
// Problem Link: https://leetcode.com/problems/string-to-integer-atoi/
// Approach: Use simulation with overflow checking. First, skip leading spaces and determine the sign from + or -. Then process each digit and build the number. Before adding a digit, check whether multiplying by 10 and adding the digit would exceed the integer range. If overflow occurs, return Integer.MAX_VALUE or Integer.MIN_VALUE; otherwise, return the signed result.
// Time Complexity: O(n) — each character is processed at most once.
// Space Complexity: O(1) — only a few variables are used.
