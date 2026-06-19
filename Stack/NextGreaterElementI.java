class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        int[] arr = new int[10001];
        for(int i = nums2.length-1; i>=0; i--){
            while(!stk.isEmpty()&& stk.peek()<= nums2[i])
                stk.pop();
            arr[nums2[i]] = stk.isEmpty()? -1: stk.peek();
            stk.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i] = arr[nums1[i]];
        }
        return nums1;
    }
}

// Problem: Next Greater Element I
// Problem Link: https://leetcode.com/problems/next-greater-element-i/
// Approach: Traverse nums2 from right to left using a monotonic decreasing stack to store next greater elements; 
// store results in a map-like array, then replace values in nums1 using precomputed results.
// Time Complexity: O(n + m)
// Space Complexity: O(n + k) (stack + result array of size up to max value range)
