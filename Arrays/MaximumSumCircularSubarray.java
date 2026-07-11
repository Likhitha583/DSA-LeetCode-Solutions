class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length,maxss = nums[0],minss=nums[0],sum=nums[0],ts = nums[0];
        for(int i=1;i<n;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            maxss = Math.max(maxss,sum);
        }
        sum = nums[0];
        for(int i=1;i<n;i++){
            sum = Math.min(sum+nums[i],nums[i]);
            minss = Math.min(minss,sum);
            ts += nums[i]; 
        }
        if(ts == minss) return maxss;
        return Math.max(maxss,ts-minss);
    }
}

// Problem: Maximum Sum Circular Subarray
// Problem Link: https://leetcode.com/problems/maximum-sum-circular-subarray/
// Approach: Use Kadane’s algorithm twice—once to find the maximum subarray sum and once to find the minimum subarray sum.
// The answer is the maximum of the normal subarray sum and the circular subarray sum (totalSum - minSubarraySum), with a 
// special case when all elements are negative.
// Time Complexity: O(n) (two linear traversals)
// Space Complexity: O(1)
