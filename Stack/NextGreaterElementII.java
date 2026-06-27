class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length,k;
        int res[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i = 2*n -1;i>=0;i--){
            k = i%(n);
            while(!stk.isEmpty() && stk.peek() <= nums[k])
                stk.pop();
            if(!stk.isEmpty() && stk.peek() > nums[k])
                res[k] = stk.peek();
            else 
                res[k] = -1;
            stk.push(nums[k]);
        }
        return res;
    }
}

// Problem: Next Greater Element II
// Problem Link: https://leetcode.com/problems/next-greater-element-ii/
// Approach: Traverse the circular array twice from right to left using a monotonic decreasing stack. 
// For each element,pop smaller or equal elements, then the stack top (if any) is its next greater element.
// Time Complexity: O(n) (each element is pushed and popped at most twice)
// Space Complexity: O(n) (stack + result array)
