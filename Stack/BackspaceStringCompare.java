class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            if (!stk1.isEmpty() && s.charAt(i) == '#')
                stk1.pop();
            else
                stk1.push(s.charAt(i));
            i++;
        }
        i = 0;
        while (i < t.length()) {
            if (!stk2.isEmpty() && t.charAt(i) == '#')
                stk2.pop();
            else
                stk2.push(t.charAt(i));
            i++;
        }
        while (!stk1.isEmpty()) {
            if (stk1.pop() != stk2.pop())
                return false;
        }
        return true;
    }
}

// Problem: Backspace String Compare
// Problem Link: https://leetcode.com/problems/backspace-string-compare/
// Approach: Process both strings using separate stacks. Push characters normally, and on # pop the top character
// if the stack is not empty. Finally, compare the resulting stacks character by character.
// Time Complexity: O(n + m), where n and m are the lengths of s and t.
// Space Complexity: O(n + m) for the two stacks.
