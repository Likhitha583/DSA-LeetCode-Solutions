class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() <= k)
            return "0";
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char nums[] = num.toCharArray();
        stk.push(nums[0] - '0');
        for (int i = 1; i < num.length(); i++) {
            while (!stk.isEmpty() && stk.peek() > nums[i] - '0' && k > 0) {
                stk.pop();
                k--;
            }
            stk.push(nums[i] - '0');
        }
        while (k-- > 0)
            stk.pop();
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == '0') {
            sb.deleteCharAt(sb.length() - 1);
            if (sb.length() == 0)
                return "0";
        }
        return sb.reverse().toString();
    }
}

// Problem: Remove K Digits
// Problem Link: https://leetcode.com/problems/remove-k-digits/
// Approach: Use a monotonic increasing stack to remove larger previous digits while k > 0. After processing all digits,
// remove any remaining digits from the top, reverse the stack into a string, and remove leading zeros.
// Time Complexity: O(n) (each digit is pushed and popped at most once)
// Space Complexity: O(n) (stack + output string)
