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

// Problem: Remove duplicates from a sorted array
// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Approach: Two pointer 
// Time Complexity: O(n) where n is length of array and array is traversed once.
// Space Complexity: O(1) No extra space required.
