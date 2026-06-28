class Solution {
    public int largestRectangleArea(int[] heights) {
        int area = 0, lft = -1,n=heights.length,ht;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i<n;i++){
            while(!stk.isEmpty()&& heights[stk.peek()] > heights[i]){
                ht = heights[stk.peek()];
                stk.pop();
                lft = stk.isEmpty() ? -1 : stk.peek();
                area = Math.max(area,ht*(i-lft -1));
            }
            stk.push(i);
        }
        while(!stk.isEmpty()){
            ht = heights[stk.peek()];
                stk.pop();
                lft = stk.isEmpty() ? -1 : stk.peek();
                area = Math.max(area,ht*(n-lft -1));
        }
        return area;
    }
}

// Problem: Largest Rectangle in Histogram
// Problem Link: https://leetcode.com/problems/largest-rectangle-in-histogram/
// Approach: Use a monotonic increasing stack of indices. When a smaller bar is encountered, pop taller bars and calculate
// the maximum rectangle area using the current index as the right boundary and the new stack top as the left boundary.
// Time Complexity: O(n) (each index is pushed and popped at most once)
// Space Complexity: O(n) (stack stores bar indices)
