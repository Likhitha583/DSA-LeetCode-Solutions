class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int c = 0;
            while (num > 0) {
                c += (num % 10);
                num /= 10;
            }
            if (i == c)
                return i;
        }
        return -1;
    }
}

// Problem: Smallest Index With Digit Sum Equal to Index
// Problem Link: https://leetcode.com/problems/smallest-index-with-digit-sum-equal-to-index/
// Approach: Traverse the array and calculate the sum of digits of each nums[i]. If the digit sum equals the current index i, return that index immediately; otherwise, return -1 after checking all elements.
// Time Complexity: O(n × d) — where d is the maximum number of digits in an element.
// Space Complexity: O(1).
