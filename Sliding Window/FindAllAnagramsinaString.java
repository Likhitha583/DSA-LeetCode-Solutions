class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList <Integer> res = new ArrayList<>();
        if (p.length() > s.length())
           return new ArrayList<>();
        int n = p.length();
        int m = s.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < n; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }
        if (java.util.Arrays.equals(freq1, freq2))
                res.add(0);
        for (int i = n; i < m; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq1[s.charAt(i - n) - 'a']--;
            if (java.util.Arrays.equals(freq1, freq2))
                res.add(i-n+1);
        }
        return res;
    }
}

// Problem: Find All Anagrams in a String
// Problem Link: https://leetcode.com/problems/find-all-anagrams-in-a-string/
// Approach: Use a sliding window of size p.length() with two frequency arrays (26 letters).
// compare frequencies after each window shift and add the starting index when they match.
// Time Complexity: O(m) where m = s.length()
// Space Complexity: O(1)
