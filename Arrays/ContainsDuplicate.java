class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i])
                return true;
        }
        return false;
    }
}

// Problem: Contains Duplicate
// Problem Link: https://leetcode.com/problems/contains-duplicate/description/
// Approach: Sorting and checking adjacent elements
// Time Complexity: O(n log n) due to sorting
// Space Complexity: O(1) if we ignore the space used by sorting, otherwise O(n) depending on the sorting algorithm used.