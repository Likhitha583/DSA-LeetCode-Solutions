class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    a.add(nums[j]);
                }
            }
            boolean flag = true;
            for (int k = 0; k < res.size(); k++) {
                if (res.get(k).equals(a)) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                res.add(a);
        }
        return (res);
    }
}

// Problem: Subsets II
// Problem Link: https://leetcode.com/problems/subsets-ii/
// Approach: Sort the array and generate all subsets using bitmasks. For each subset, check whether it already exists in the result list; add it only if it is unique.
// Time Complexity: O(n × 4ⁿ)
// Space Complexity: O(n × 2ⁿ) (for storing the result).
