class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length() - 1;
        while (num.charAt(n) == '0')
            n--;
        return num.substring(0, n + 1);
    }
}

// Problem: Remove Trailing Zeros From a String
// Problem Link: https://leetcode.com/problems/remove-trailing-zeros-from-a-string/
// Approach: Use two-pointer-style backward traversal. Start from the last character and move left while the character is '0'. Once a non-zero digit is found, return the substring from the beginning up to that position.
// Time Complexity: O(n) — in the worst case, all characters are checked.
// Space Complexity: O(n) — substring() creates the resulting string.
