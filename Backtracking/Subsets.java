class Solution {
    void backtrack(int i, int[] nums, List<List<Integer>> res, List<Integer> arr) {
        if (i == nums.length) {
            res.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[i]);
        backtrack(i + 1, nums, res, arr);
        arr.remove(arr.size() - 1);
        backtrack(i + 1, nums, res, arr);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        backtrack(0, nums, res, arr);
        return res;
    }
}

// Problem: Subsets
// Problem Link: https://leetcode.com/problems/subsets/
// Approach: Use backtracking with two choices for each element: include it in the current subset or exclude it. When all elements are processed, add a copy of the current subset to the result.
// Time Complexity: O(n × 2ⁿ)
// Space Complexity: O(n) auxiliary space (recursion stack and temporary subset), excluding output.
