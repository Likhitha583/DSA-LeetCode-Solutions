class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int n1, n2;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                n2 = stk.pop();
                n1 = stk.pop();
                stk.push(n1 + n2);
            } else if (tokens[i].equals("-")) {
                n2 = stk.pop();
                n1 = stk.pop();
                stk.push(n1 - n2);
            } else if (tokens[i].equals("*")) {
                n2 = stk.pop();
                n1 = stk.pop();
                stk.push(n1 * n2);
            } else if (tokens[i].equals("/")) {
                n2 = stk.pop();
                n1 = stk.pop();
                stk.push(n1 / n2);
            } else {
                stk.push(Integer.parseInt(tokens[i]));
            }

        }
        return stk.peek();
    }
}

// Problem: Evaluate Reverse Polish Notation
// Problem Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
// Approach: Traverse the tokens array.If the token is a number, push it into the stack. Otherwise, 
// pop two elements (b first, then a),perform the operation (a op b), and push the result back into the stack.
// Time Complexity: O(N) We process each token exactly once.
// Space Complexity: O(N) In the worst case, all tokens are numbers and are stored in the stack.
