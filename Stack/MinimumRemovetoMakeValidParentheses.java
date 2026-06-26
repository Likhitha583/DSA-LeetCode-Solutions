class Solution {
    public String minRemoveToMakeValid(String s) {
        int cnt = 0;
        Stack<Character> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                cnt++;
                stk.push(ch);
            } else if (ch == ')') {
                if (cnt > 0) {
                    cnt--;
                    stk.push(ch);
                }
            } else
                stk.push(ch);
        }
        while (!stk.isEmpty()) {
            if (cnt > 0 && stk.peek() == '(') {
                stk.pop();
                cnt--;
            } else
                sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}

// Problem: Minimum Remove to Make Valid Parentheses
// Problem Link: https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
// Approach: Traverse the string and push valid characters onto a stack while tracking unmatched '('.Ignore invalid ')', 
// then remove the remaining unmatched '(' during a reverse traversal and build the final valid string.
// Time Complexity: O(n) (each character is processed at most twice)
// Space Complexity: O(n) (stack and output string)
