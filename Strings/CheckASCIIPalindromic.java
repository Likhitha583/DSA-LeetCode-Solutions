class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(String.format("%8s", 
            Integer.toBinaryString(s.charAt(i))).replace(' ', '0'));
        }
        String st = sb.toString();
        int left = 0;
        int right = st.length() - 1;
        while (left < right) {
            if (st.charAt(left) != st.charAt(right))
                return false;

            left++;
            right--;
        }
        return true;
    }
}

// Problem: Check ASCII Palindromic
// Problem Link: https://leetcode.com/problems/check-ascii-palindromic/
// Approach: Convert each character of the string into its 8-bit binary ASCII representation, concatenate all binary values, and use two pointers from both ends to check whether the resulting binary string is a palindrome.
// Time Complexity: O(n), where n is the length of the input string.
// Space Complexity: O(n) for storing the binary string.
