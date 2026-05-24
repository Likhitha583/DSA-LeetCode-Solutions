class Solution {
    static void rev(int nums[], int k, int n) {
        int temp;
        while (k < n) {
            temp = nums[k];
            nums[k] = nums[n];
            nums[n] = temp;
            k++;
            n--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rev(nums, 0, nums.length - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, nums.length - 1);
    }
}

// Problem: Rotate Array
// Problem Link: https://leetcode.com/problems/rotate-array/
// Approach: Reverse entire array, reverse first k elements, then reverse remaining elements to achieve right rotation 
// Time Complexity: O(N) each element is reversed at most once during the three reversal operations.
// Space Complexity: O(1) Rotation is performed in place without extra space.
