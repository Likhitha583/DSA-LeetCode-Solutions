class Solution {
    public int[] constructRectangle(int area) {
        int val1 = 1, val2 = area, min = area;
        for (int i = 1; i <= Math.sqrt(area); i++) {
            if (area % i == 0) {
                if (min > Math.abs(i - (area / i))) {
                    val1 = area / i;
                    val2 = i;
                    min = Math.abs(val1 - val2);
                }
            }
        }
        return new int[] { val1, val2 };
    }
}

// Problem: Construct the Rectangle
// Problem Link: https://leetcode.com/problems/construct-the-rectangle/
// Approach: Iterate from 1 to √area and check for divisors. For each valid factor pair, calculate the difference and retain the pair with the minimum difference.
// Time Complexity: O(√area)
// Space Complexity: O(1)
