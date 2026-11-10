class Solution {
    public String getSmallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 1; i < s.length(); i++) {
            int c1 = s.charAt(i - 1) - '0';
            int c2 = s.charAt(i) - '0';
            if (c1 % 2 == c2 % 2 && c1 > c2) {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(i - 1));
                sb.setCharAt(i - 1, temp);
                break;
            }
        }
        return sb.toString();
    }
}

// Problem: Lexicographically Smallest String After a Swap
// Problem Link: https://leetcode.com/problems/lexicographically-smallest-string-after-a-swap/
// Approach: Traverse the string and find the first adjacent pair of digits having the same parity, where the left digit is greater than the right digit. Swap them once to obtain the lexicographically smallest string.
// Time Complexity: O(n)
// Space Complexity: O(n) for the StringBuilder.
