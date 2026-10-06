class Solution {
    HashMap<Character, String> map = new HashMap<>();
    ArrayList<String> res = new ArrayList<>();
    void combo(String digits, StringBuilder s, int i) {
        if (i == digits.length()) {
            res.add(s.toString());
            return;
        }
        String str = map.get(digits.charAt(i));
        for (int k = 0; k < str.length(); k++) {
            combo(digits, s.append(str.charAt(k)), i + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }
    public List<String> letterCombinations(String digits) {
        res.clear();
        StringBuilder sb = new StringBuilder();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        combo(digits, sb, 0);
        return res;
    }
}

// Problem: Letter Combinations of a Phone Number
// Problem Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Approach: Use Backtracking with StringBuilder. For each digit, retrieve its corresponding letters and try each one recursively. Append a letter before the recursive call and remove it afterward (backtracking) so the same StringBuilder can be reused. When all digits are processed, add s.toString() to the result.
// Time Complexity: O(4ⁿ × n) — in the worst case, there are 4ⁿ combinations, and converting each combination to a String takes O(n).
// Space Complexity: O(4ⁿ × n) for storing all output combinations + O(n) recursion depth and StringBuilder.
