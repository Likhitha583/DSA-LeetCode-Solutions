class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder temp = new StringBuilder(strs[0]);
        int j =0,k=temp.length()-1;
        for(int i= 1;i<strs.length;i++){
            j = 0;
            k=temp.length();  
            while(j<k && j< strs[i].length()&& temp.charAt(j)== strs[i].charAt(j))
                j++;
            temp.delete(j,k);
        }
        return temp.toString();
    }
}

// Problem: Longest common prefix
// Problem Link:https://leetcode.com/problems/longest-common-prefix/
// Approach: Initialize a StringBuilder with the first string and continuously trim it 
// while comparing with the remaining strings until only the common prefix remains.
// Time Complexity: O(N*M) where N = number of strings and M = average prefix length.
// Space Complexity: O(1) No extra space needed.
