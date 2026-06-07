class Solution {
    private boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int n = s.length(), cnt = 0, maxCnt = 0;
        char ch;
        for (int i = 0; i < k; i++) {
            ch = s.charAt(i);
            if(isVowel(ch))
                cnt++;
        }
        maxCnt = cnt;
        for (int i = k; i < n; i++) {
            ch = s.charAt(i - k);
            if (isVowel(ch)) {
                cnt--;
            }
            ch = s.charAt(i);
            if (isVowel(ch))
                cnt++;
            maxCnt = Math.max(cnt, maxCnt);
        }
        return maxCnt;
    }
}

// Problem: Maximum Number of Vowels in a Substring of Given Length
// Problem Link: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
// Approach: Use a sliding window of size k and count the vowels in the first window. 
// As the window slides, decrement the count if the outgoing character is a vowel and increment it if the incoming character is a vowel.
// Time Complexity: O(n) 
// Space Complexity: O(1)
