class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length,j=0,t;
        for(int i=0;i<n;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
        }}
        while(j<n){
            nums[j] = 0;
            j++;
        }
    }
}

// Problem: Move Zeroes
// Problem Link: https://leetcode.com/problems/move-zeroes/description/ 
// Approach: Two pointers, one for iterating through the array and another for keeping track of the position to place the next non-zero element.
// Time Complexity: O(n) where n is the length of the array, as we traverse 
// the array twice in the worst case (once for moving non-zero elements and once for filling zeros).
// Space Complexity: O(1) as we are modifying the array in place without using any additional data structures.  
