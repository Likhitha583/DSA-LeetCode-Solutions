class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int diff = xor & (-xor);
        int a = 0;
        int b = 0;
        for (int num : nums) {
            if ((num & diff) != 0)
                a ^= num;
            else
                b ^= num;
        }
        return new int[] { a, b };
    }
}

// Problem: Single Number III
// Problem Link: https://leetcode.com/problems/single-number-iii/
// Approach: XOR all elements to get a ^ b, then use the rightmost set bit (xor & -xor) to divide numbers into two groups. XORing each group separately cancels duplicates and gives the two unique numbers.
// Time Complexity: O(n)
// Space Complexity: O(1)
