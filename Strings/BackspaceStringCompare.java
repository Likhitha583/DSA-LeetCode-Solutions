class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = t.length()-1,j=s.length()-1,k=0,l=0;
        while(j>=0 || i >=0){
            while(i>=0){
                if(t.charAt(i)== '#'){
                k++;
                i--;
            }
            else if(k>0 &&t.charAt(i)!='#'){
                k--;
                i--;
            }
                else break;
            }
        while(j>=0){
            if(s.charAt(j)== '#'){
                l++;
                j--;
        }
            else if(l>0&& s.charAt(j)!='#'){
                l--;
                j--;
            }
            else break;
        }
            if(i>=0 && j<0)
                return false;
            else if(j>=0 && i<0)
                return false;
            if((i>=0 && j>= 0) && s.charAt(j) != t.charAt(i))
                return false;
            i--;
            j--;
        }
        return true;
    }
}

// Problem: Backspace String Compare 
// Problem Link: https://leetcode.com/problems/backspace-string-compare/
// Approach: Use two pointers starting from the end of both strings. Skip characters that should be deleted by
// tracking pending backspaces (#), then compare the next valid characters from both strings.
// Time Complexity: O(n + m), where n and m are the lengths of s and t.
// Space Complexity: O(1), since only a few variables are used.
