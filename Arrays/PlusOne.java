class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; 
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}

// Problem : Plus One
// Problem Link: https://leetcode.com/problems/plus-one/description/
// Approach: We start from the last digit and add one. 
// If the digit is less than 9, we can simply increment it and return the array. 
// If the digit is 9, we set it to 0 and move to the next digit. 
// If we have processed all digits and they were all 9s, we need to create a new array with an extra digit at the beginning set to 1, and the rest will be 0s.
// Time Complexity: O(n) where n is the number of digits in the input array. In the worst case, we may need to process all digits if they are all 9s.
// Space Complexity: O(1) for the in-place modification of the input array. However, if we need to create a new array for the case where all digits are 9s, the space complexity would be O(n) due to the new array.