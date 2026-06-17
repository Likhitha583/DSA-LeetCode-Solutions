class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!stk.isEmpty() && stk.peek() == s.charAt(i))
                stk.pop();
            else
                stk.push(s.charAt(i));
        }
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}

// Problem: Remove All Adjacent Duplicates In String
// Problem Link: https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// Approach: Traverse the string once using a stack. If the current character matches the stack's top, pop it; 
// otherwise, push it. Finally, build the answer by popping all characters and reverse it.
// Time Complexity: O(n) — each character is pushed and popped at most once.
// Space Complexity: O(n) — in the worst case, the stack stores all characters.
