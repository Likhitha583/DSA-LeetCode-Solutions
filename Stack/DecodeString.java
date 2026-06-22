class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder str = new StringBuilder();
        Stack<String> stk = new Stack<>();
        char t = ' ';
        int n = s.length(), i = 0, k = 0;
        while (i < n) {
            if (s.charAt(i) == ']') {
                sb = new StringBuilder();
                while (!stk.peek().equals("[")) {
                    sb.insert(0, stk.pop()); 
                }
                stk.pop();
                str = new StringBuilder();
                while (!stk.isEmpty()) {
                    t = stk.peek().charAt(0);
                    if (t >= '0' && t <= '9')
                        str.insert(0, stk.pop()); 
                    else
                        break;
                }
                if (str.length() > 0)
                    k = Integer.parseInt(str.toString());
                str = new StringBuilder();
                while (k-- > 0)
                    str.append(sb);                stk.push(str.toString());
            } else {              stk.push(Character.toString(s.charAt(i)));
            }
            i++;
        }
        str = new StringBuilder();
        while (!stk.isEmpty())
            str.insert(0, stk.pop());
        return str.toString();
    }
}

// Problem: Decode String 
// Problem Link: https://leetcode.com/problems/decode-string/
// Approach: Traverse the string and use a stack to store characters. When ] is encountered, pop characters until [,
// extract the preceding number, repeat the substring that many times, and push it back onto the stack.
// Time Complexity: O(n × k), where k is the maximum repetition factor (overall proportional to the length of the decoded output).
// Space Complexity: O(n × k) (stack and decoded string storage).
