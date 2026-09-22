class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0, n = chars.length, cnt = 0;
        while (i < n) {
            cnt = 1;
            chars[j++] = chars[i];
            while (i < n - 1 && chars[i] == chars[i + 1]) {
                i++;
                cnt++;
            }
            if (cnt > 1) {
                int st = j;
                while (cnt > 0) {
                    chars[j++] = (char) ('0' + cnt % 10);
                    cnt /= 10;
                }
                int end = j - 1;
                while (st < end) {
                    char temp = chars[st];
                    chars[st++] = chars[end];
                    chars[end--] = temp;
                }
            }
            i++;
        }
        return j;
    }
}

// Problem: String Compression
// Problem Link: https://leetcode.com/problems/string-compression/
// Approach: Use Two Pointers + In-Place Compression. i scans the original groups of consecutive characters, while j writes the compressed result. For each group, write the character once and, if its count is greater than 1, write its digits. Since the digits are generated in reverse order, reverse them afterward to get the correct count.
// Time Complexity: O(n) — each character is processed a constant number of times.
// Space Complexity: O(1) — compression is performed in-place.
