class Solution {
    public int trap(int[] height) {
        int n = height.length,k=n-1,res = 0;
        int[] pm = new int[n];
        int[] sm = new int[n];
        pm[0]=height[0];
        sm[k]= height[k];
        for(int i=1;i<n;i++){
            pm[i] = Math.max(pm[i-1],height[i]);
            sm[k-i] = Math.max(sm[k-i+1],height[k-i]);
        }
        for(int i=0;i<n;i++){
            res += (Math.min(pm[i],sm[i])-height[i]);
        }
        return res;
    }
}

// Problem: Trapping Rain Water
// Problem Link: https://leetcode.com/problems/trapping-rain-water/
// Approach: Precompute the maximum height to the left (prefixMax) and right (suffixMax) of every index.
// The water trapped at each position is min(prefixMax, suffixMax) - height[i]; sum this value for all indices.
// Time Complexity: O(n) (three linear traversals)
// Space Complexity: O(n) (two auxiliary arrays for prefix and suffix maximums)
