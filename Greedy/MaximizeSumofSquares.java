class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum > 9 * num)
            return "";
        StringBuilder sb = new StringBuilder();
        int k = sum / 9, r = sum % 9;
        int i = num - k - 1;
        while (k-- > 0)
            sb.append('9');
        sb.append(r);
        while (i-- > 0)
            sb.append('0');
        return sb.toString().substring(0, num);
    }
}

// Problem: Maximize Sum of Squares of Digits
// Problem Link: https://leetcode.com/problems/maximize-sum-of-squares-of-digits/
// Approach: Use a Greedy approach to maximize the sum of squares by placing the largest possible digits first. Since digits are at most 9, calculate how many 9s fit into sum using sum / 9, then find the remaining value using sum % 9. Append the 9s, the remainder, and enough zeros to make the number have num digits. Return an empty string if sum > 9 × num.
// Time Complexity: O(num) — building the result string takes linear time.
// Space Complexity: O(num) — for the StringBuilder and resulting string.
