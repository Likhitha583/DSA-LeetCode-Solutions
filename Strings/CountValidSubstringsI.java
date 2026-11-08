class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length(), l = 0, r = 0;
        long cnt = 0;
        while (r < n) {
            if (r > 1 && s.charAt(r - 2) == 'a' && s.charAt(r - 1) == 'b' && s.charAt(r) == 'c')
                l = Math.max(l, r - 1);
            cnt += (r - l + 1);
            r++;
        }
        return cnt;
    }
}

// Problem: Count Valid Substrings I
// Problem Link: https://leetcode.com/problems/count-valid-substrings-i/
// Approach: Use the sliding window technique with two pointers (l and r). Whenever the substring "abc" is found ending at r, update the left pointer to r - 1. Add (r - l + 1) to the count to include all valid substrings ending at r.
// Time Complexity: O(n)
// Space Complexity: O(1)
