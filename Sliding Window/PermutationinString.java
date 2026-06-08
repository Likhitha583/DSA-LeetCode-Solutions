class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if (n > m) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < n; i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        if (java.util.Arrays.equals(freq1, freq2))
            return true;
        for (int i = n; i < m; i++) {
            freq2[s2.charAt(i) - 'a']++;
            freq2[s2.charAt(i - n) - 'a']--;
            if (java.util.Arrays.equals(freq1, freq2))
                return true;
        }
        return false;
    }
}

// Problem: Permutation in String
// Problem Link: https://leetcode.com/problems/permutation-in-string/
// Approach: Use a sliding window of size s1.length() and maintain character frequencies for s1 and the current window in s2. If the frequency arrays become equal at any window, a permutation of s1 exists in s2.
// Time Complexity: O(26 × (m - n + 1)) ≈ O(m)
// Space Complexity: O(1)
