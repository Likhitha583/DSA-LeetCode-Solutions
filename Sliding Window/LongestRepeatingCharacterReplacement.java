class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int freq[] = new int[26];
        int maxfreq = 0, maxlen = 0, l = 0;
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'A']++;
            maxfreq = Math.max(maxfreq, freq[s.charAt(i) - 'A']);
            if ((i - l + 1) - maxfreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            } else
                maxlen = Math.max(maxlen, i - l + 1);
        }
        return maxlen;
    }
}

// Problem: Longest Repeating Character Replacement
// Problem Link: https://leetcode.com/problems/longest-repeating-character-replacement/
// Approach: Use a sliding window and maintain the frequency of characters within the current window. 
// Track maxFreq (highest frequency character in the window). If the number of characters to replace,
// (windowSize - maxFreq), exceeds k, shrink the window from the left;otherwise, update the maximum valid window length.
// Time Complexity: O(n)
// Space Complexity: O(1) (frequency array of size 26)
