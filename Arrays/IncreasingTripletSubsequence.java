class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= first) 
                first = num;
            else if (num <= second) 
                second = num;
            else 
                return true;
        }
        return false;
    }
}

// Problem: Increasing Triplet Subsequence
// Problem Link: https://leetcode.com/problems/increasing-triplet-subsequence/
// Approach: Use a Greedy approach with two variables. first stores the smallest value seen so far, and second stores the smallest possible value greater than first. For each number, update first if possible; otherwise update second. If a number is greater than both, we have found first < second < num, so an increasing triplet exists.
// Time Complexity: O(n) — one traversal of the array.
// Space Complexity: O(1) — only two variables are used.
