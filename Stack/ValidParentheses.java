import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stk.push(ch);
            } else {
                if (stk.isEmpty())
                    return false;

                char p = stk.peek();

                if ((ch == ')' && p == '(') ||
                    (ch == '}' && p == '{') ||
                    (ch == ']' && p == '[')) {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }

        return stk.isEmpty();
    }
}

// Problem: Valid Parentheses
// Problem Link: https://leetcode.com/problems/valid-parentheses/
// Approach: Use a stack to store opening brackets (, {, [.
// For every closing bracket, check whether the stack top contains the matching opening bracket; 
// if yes, pop it, otherwise return false.
// Time Complexity: O(n) — each character is processed once, and every bracket is pushed/popped at most once.
// Space Complexity: O(n) — in the worst case, all characters are opening brackets and are stored in the stack.
