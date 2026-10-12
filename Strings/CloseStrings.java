class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        int f1[] = new int[26];
        int f2[] = new int[26];
        for (int i = 0; i < word1.length(); i++)
            f1[word1.charAt(i) - 'a']++;
        for (int i = 0; i < word1.length(); i++) {
            f2[word2.charAt(i) - 'a']++;
            if (f1[word2.charAt(i) - 'a'] == 0)
                return false;
        }
        int i = 25;
        Arrays.sort(f1);
        Arrays.sort(f2);
        while (i >= 0) {
            if (f1[i] != f2[i])
                return false;
            i--;
        }
        return true;
    }
}

// Problem: Determine if Two Strings Are Close
// Problem Link: https://leetcode.com/problems/determine-if-two-strings-are-close/
// Approach: Use Character Frequency Counting. First, check whether both strings have equal lengths. Count each character's frequency in both strings and verify that every character in word2 also exists in word1. Then sort both frequency arrays and compare them. If the sorted arrays match, the strings are close; otherwise, return false.
// Time Complexity: O(n + 1), which simplifies to O(n), because sorting two arrays of fixed size 26 takes constant time.
// Space Complexity: O(1) — two frequency arrays of fixed size 26.
