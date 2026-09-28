class Solution {
    public int maxDepth(String s) {
        int maxd = 0, d = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ')')
                d--;
            else {
                if (ch != '(')
                    continue;
                d++;
                maxd = Math.max(d, maxd);
            }
        }
        return maxd;
    }
}

// Problem: Maximum Nesting Depth of the Parentheses
// Problem Link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
// Approach: Traverse the string while maintaining the current parenthesis depth d. Increment d for '(', decrement it for ')', and update maxd whenever a new maximum depth is reached.
// Time Complexity: O(n) — each character is visited once.
// Space Complexity: O(1) — only two integer variables are used.
