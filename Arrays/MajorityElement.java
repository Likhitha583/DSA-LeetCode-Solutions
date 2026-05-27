class Solution {
    public int majorityElement(int[] nums) {
        int c = 0, j = 0;
        for (int num : nums) {
            if (c == 0) {
                j = num;
            }
            c += (num == j) ? 1 : -1;
        }
        return j;
    }
}

// Problem: Majority Element
// Problem Link: https://leetcode.com/problems/majority-element/
// Approach: Use Boyer–Moore Voting Algorithm. Increase count for same element, decrease for different elements.
// The majority element survives after all cancellations.
// Time Complexity: O(N) 
// Space Complexity: O(1)
