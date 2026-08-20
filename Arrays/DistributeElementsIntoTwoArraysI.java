class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int k1 = 0;
        int k2 = 0;
        arr1[k1++] = nums[0];
        arr2[k2++] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (arr1[k1 - 1] > arr2[k2 - 1])
                arr1[k1++] = nums[i];
            else
                arr2[k2++] = nums[i];
        }
        for (int i = 0; i < k1; i++)
            nums[i] = arr1[i];
        for (int i = 0; i < k2; i++)
            nums[k1 + i] = arr2[i];
        return nums;
    }
}

// Problem: Distribute Elements Into Two Arrays I
// Problem Link: https://leetcode.com/problems/distribute-elements-into-two-arrays-i/
// Approach: Initialize two arrays with the first two elements, then place each remaining element into the array whose last element is greater. Finally, concatenate arr1 and arr2 back into nums.
// Time Complexity: O(n)
// Space Complexity: O(n) (two auxiliary arrays)
