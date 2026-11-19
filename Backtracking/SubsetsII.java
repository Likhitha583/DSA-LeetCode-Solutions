class Solution {
    public void backtrack(int i, int[] nums, List<List<Integer>> res, List<Integer> arr) {
        res.add(new ArrayList<>(arr));
        for (int j = i; j < nums.length; j++) {
            if (j > i && nums[j] == nums[j - 1])
                continue;
            arr.add(nums[j]);
            backtrack(j + 1, nums, res, arr);
            arr.remove(arr.size() - 1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0, nums, res, arr);
        return (res);
    }
}

// Problem: Subsets II
// Problem Link: https://leetcode.com/problems/subsets-ii/
// Approach: Use backtracking to generate subsets. Sort the array and skip duplicate elements at the same recursion level to avoid generating duplicate subsets. Add each current subset to the result.
// Time Complexity: O(n × 2ⁿ)
// Space Complexity: O(n) auxiliary space (recursion stack and temporary subset), excluding output.
