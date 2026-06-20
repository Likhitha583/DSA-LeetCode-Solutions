class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stk = new Stack<>();
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (stk.isEmpty()) {
                res[i] = 0;
                stk.push(i);
            } else {
                while (!stk.isEmpty() && temperatures[stk.peek()] <= temperatures[i]) {
                    stk.pop();
                }
                if (!stk.isEmpty())
                    res[i] = stk.peek() - i;
                stk.push(i);
            }
        }
        return res;
    }
}

// Problem: Daily Temperatures
// Problem Link: https://leetcode.com/problems/daily-temperatures/
// Approach: Traverse the temperatures array from right to left using a monotonic decreasing stack of indices. 
// Pop all indices with smaller or equal temperatures, then the top gives the next warmer day; store its distance.
// Time Complexity: O(n) (each index is pushed and popped at most once)
// Space Complexity: O(n) (stack + result array)
