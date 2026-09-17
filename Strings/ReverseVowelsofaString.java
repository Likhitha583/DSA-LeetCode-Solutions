class Solution {
    boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public String reverseVowels(String s) {
        int n = s.length();
        char c[] = s.toCharArray();
        int i = 0, j = n - 1;
        while (i < j) {
            while (i < n && !isVowel(c[i])) {
                i++;
            }
            while (j >= 0 && !isVowel(c[j])) {
                j--;
            }
            if (i < j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        return new String(c);
    }
}

// Problem: Reverse Vowels of a String
// Problem Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
// Approach: Use the Two-Pointer technique. Place one pointer at the beginning and another at the end. Move i forward and j backward until both point to vowels, then swap them. Continue until the pointers meet or cross.
// Time Complexity: O(n) — each character is visited at most once.
// Space Complexity: O(n) — char[] is created from the string, and a new String is returned.
