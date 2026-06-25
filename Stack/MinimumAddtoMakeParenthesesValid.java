class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stk = new Stack<>();
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(')
                stk.push(s.charAt(i));
            else{
                if(!stk.isEmpty())
                stk.pop();
                else 
                    cnt++;
            }
        }
        while(!stk.isEmpty()){
            stk.pop();
            cnt++;
        }
        return cnt;
    }
}

// Problem: Minimum Add to Make Parentheses Valid
// Problem Link: https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// Approach: Traverse the string using a stack to track unmatched'('.For every ')',match it with a stack element if possible; 
// otherwise, count it as an extra parenthesis. The answer is the count of unmatched ')' plus remaining '(' in the stack.
// Time Complexity: O(n) (single traversal of the string)
// Space Complexity: O(n) (stack may store all opening parentheses)
