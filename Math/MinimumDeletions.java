class Solution {
    public int minDeletions(int[] nums) {
        int n = nums.length,i=1,j=0,del=0;
        while(i<n){
            if((nums[i-1] ^ nums[i]) == 0)
            del++;
            else 
                j++;
            i++;
        }
        return del;
    }
}

// Problem: Minimum Deletions to Make Array Sharp
// Problem Link: https://leetcode.com/problems/minimum-deletions-to-make-array-sharp/
// Approach: Traverse the array and compare adjacent elements using XOR. If their XOR is 0, increment deletions; otherwise, move to the next pair.
// Time Complexity: O(n)
// Space Complexity: O(1)
