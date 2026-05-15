class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j= s.length()-1;
        while(i<j){
            if( Character.isLetterOrDigit(s.charAt(i))&& Character.isLetterOrDigit(s.charAt(j))){
               if(s.charAt(i)!=s.charAt(j))
                   return false;
            i++;
                   j--;
            }
            else if(!(Character.isLetterOrDigit(s.charAt(i))))
                i++;
            else
            j--;
                
        }
        return true;
    }
}

// Problem: Valid Palindrome
// Problem Link: https://leetcode.com/problems/valid-palindrome/description/
// Approach: Using two pointers to compare characters from the start and end of the string, while ignoring non-alphanumeric characters and case differences.
// Time Complexity: O(n) where n is the length of the input string, as we traverse the string at most once.
// Space Complexity: O(1) as we are using only a constant amount of extra space for the pointers and temporary variables.