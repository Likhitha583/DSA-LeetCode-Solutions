class Solution {
    ArrayList<String> arr = new ArrayList<>();
    void generate(StringBuilder s, int i, int oc, int cc, int n) {
        if (i == n) {
            arr.add(s.toString());
            return;
        }
        if (oc < n / 2) {
            s.append("(");
            generate(s, i + 1, oc + 1, cc, n);
            s.deleteCharAt(s.length() - 1);
        }
        if (cc < oc) {
            s.append(")");
            generate(s, i + 1, oc, cc + 1, n);
            s.deleteCharAt(s.length() - 1);
        }
        return;
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder();
        generate(s, 0, 0, 0, 2 * n);
        return arr;
    }
}

// Problem: Generate Parentheses 
// Problem Link: https://leetcode.com/problems/generate-parentheses/
// Approach: Use Backtracking to generate all valid combinations of n pairs of parentheses. Add '(' while the number of opening parentheses is less than n, and add ')' only when the number of closing parentheses is less than the number of opening ones. When the string reaches length 2n, add it to the result.
// Time Complexity: O(Cₙ × n), where Cₙ = (1/(n+1)) × (2n choose n) is the number of valid parentheses combinations.The extra × n comes from creating each resulting string.
// Space Complexity: O(Cₙ × n) — for storing all valid strings, plus O(n) recursion depth.
