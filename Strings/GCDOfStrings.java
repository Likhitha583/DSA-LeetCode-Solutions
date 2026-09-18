class Solution {
    int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        int len = gcd(str1.length(), str2.length());
        return str1.substring(0, len);
    }
}

// Problem: Greatest Common Divisor of Strings
// Problem Link: https://leetcode.com/problems/greatest-common-divisor-of-strings/
// Approach: Use the GCD of strings concept. First, check whether str1 + str2 equals str2 + str1. If not, there is no common repeating pattern, so return "". If they match, the common base string's length must be the GCD of the two string lengths. Return the prefix of str1 with that length. The gcd() method uses the Euclidean algorithm.
// Time Complexity: O(n + m) — for string concatenation/comparison, where n and m are the lengths of str1 and str2.
// Space Complexity: O(n + m) — due to the temporary concatenated strings.
