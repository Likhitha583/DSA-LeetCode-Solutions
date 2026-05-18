class Solution {
    public boolean isValid(String s) {

        String str = "";

        for(char ch : s.toCharArray()) {

            if(ch == '(' || ch == '{' || ch == '[') {
                str += ch;
            }
            else {

                if(str.length() == 0)
                    return false;

                char top = str.charAt(str.length() - 1);

                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    return false;
                }

                str = str.substring(0, str.length() - 1);
            }
        }

        return str.length() == 0;
    }
}

//Problem: Valid Parenthesis
//Problem Link: https://leetcode.com/problems/valid-parentheses/
//Approach: Two Pointer 
//Time Complexity:O(N²)
//Space Complexity:O(1)
