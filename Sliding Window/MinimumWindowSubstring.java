class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length(), i = 0, l = 0, req = 0, f = 0, bs = 0, len = Integer.MAX_VALUE;
        if (m < n)
            return "";
        int freq1[] = new int[128];
        int freq2[] = new int[128];
        for (i = 0; i < n; i++) {
            freq1[t.charAt(i)]++;
            if (freq1[t.charAt(i)] == 1)
                req++;
        }
        i = 0;
        while (i < m) {
            while (i < m && f != req) {
                freq2[s.charAt(i)]++;

                if (freq1[s.charAt(i)] > 0 && freq2[s.charAt(i)] == freq1[s.charAt(i)])
                    f++;
                i++;
            }
            while (f == req) {
                if ((i - l) < len) {
                    len = i - l;
                    bs = l;
                }
                freq2[s.charAt(l)]--;
                if (freq1[s.charAt(l)] > 0 && freq2[s.charAt(l)] < freq1[s.charAt(l)])
                    f--;
                l++;
            }

        }
        if (len == Integer.MAX_VALUE)
            return "";
        return s.substring(bs, bs + len);
    }
}

// Problem: Minimum Window Substring
// Problem Link: https://leetcode.com/problems/minimum-window-substring/
// Approach: Use a variable-size sliding window with two frequency arrays: one for the required characters in t and one for the current window in s. 
// Expand the right pointer until all required character frequencies are satisfied, then shrink the left pointer to find the minimum valid window.
// Time Complexity: O(m + n) where m = s.length() and n = t.length(), since each pointer moves at most once through the string.
// Space Complexity: O(1) because the frequency arrays have fixed size 128
