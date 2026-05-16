class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int j = 0; j <= n - m; j++) {
            if (haystack.charAt(j) == needle.charAt(0)) {
                int p = j;
                int k = 0;

                while (k < m && haystack.charAt(p) == needle.charAt(k)) {
                    p++;
                    k++;
                }

                if (k == m) {
                    return j;
                }
            }
        }
        return -1;
    }
}

// Problem: Find the index of the first Occurrence in a string
// Problem Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
// Approach: iterate through each index of haystack and, whenever the first character matches, 
// check sequentially if the entire needle matches.
// Time Complexity: O(n × m) — each position of haystack is compared with needle
// Space Complexity: O(1) — no extra space used
