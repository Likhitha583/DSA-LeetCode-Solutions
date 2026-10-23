class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '*')
                stk.push(ch);
            else
                stk.pop();
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty())
            sb.append(stk.pop());
        return sb.reverse().toString();
    }
}

// Problem: Removing Stars From a String
// Problem Link: https://leetcode.com/problems/removing-stars-from-a-string/
// Approach: Use a stack to store characters. Push non-star characters and pop the top character whenever '*' appears, then build the result by popping and reversing.
// Time Complexity: O(n)
// Space Complexity: O(n)
