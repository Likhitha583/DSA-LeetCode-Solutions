class Solution {
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        int freq1[] = new int[26];
        for (int i = 0; i < chars.length(); i++)
            freq1[chars.charAt(i) - 'a']++;
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;
            int freq2[] = new int[26];
            int n = words[i].length();
            for (int j = 0; j < n; j++) {
                char ch = words[i].charAt(j);
                freq2[ch - 'a']++;
                if (freq1[ch - 'a'] < freq2[ch - 'a']) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                res += n;
        }
        return res;
    }
}

// Problem: Find Words That Can Be Formed by Characters
// Problem Link: https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
// Approach: Use frequency counting. First, store the frequency of each character in chars. For every word, maintain another frequency array and check whether any character is used more times than available in chars. If the word can be formed, add its length to res.
// Time Complexity: O(C + N × L) — where C is the length of chars, N is the number of words, and L is the maximum word length.
// Space Complexity: O(1) — both frequency arrays have a fixed size of 26.
