class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j=0;j<n;j++){  
                if(((i>>j)&1) == 1){
                    a.add(nums[j]);
                }
            }
            res.add(a);
        }
        return res;
    }
}

// Problem: Subsets
// Problem Link: https://leetcode.com/problems/subsets/
// Approach: Use Bit Manipulation. There are 2^n possible subsets. Treat each number from 0 to 2^n - 1 as a bitmask, where the j-th bit indicates whether nums[j] should be included in the current subset.
// Time Complexity: O(n × 2ⁿ) — 2ⁿ subsets, and up to n elements checked for each subset.
// Space Complexity: O(n × 2ⁿ) — to store all 2ⁿ subsets, each containing up to n elements.
