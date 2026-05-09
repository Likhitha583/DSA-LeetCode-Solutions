class Solution {
    public void reverseString(char[] s) { 
        int i=0,j= s.length;
        char st;
        for(i=0;i<(j/2);i++){
            st = s[i];
            s[i] = s[j-i-1];
            s[j-i-1] = st;
        }
    }
}

// Problem: Reverse String
// Problem Link: https://leetcode.com/problems/reverse-string/
// Approach: Two pointers swapping
// Time Complexity: O(n)
// Space Complexity: O(1)