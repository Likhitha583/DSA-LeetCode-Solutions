class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!= nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}

// Problem: Remove Duplicates from Sorted Array
// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach: Two Pointer
// Time Complexity: O(n) Traverses the array once.
// Space Complexity: O(1) No extra space required.
