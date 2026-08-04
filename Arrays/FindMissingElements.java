class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] seen = new boolean[101];
        List<Integer> res = new ArrayList<>();
        int min = nums[0], max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            seen[nums[i]] = true;
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        for (int i = min + 1; i < max; i++) {
            if (!seen[i]) {
                res.add(i);
            }
        }
        return res;
    }
}

// Problem: Find Missing Elements
// Problem Link: https://leetcode.com/problems/find-missing-elements/
// Approach: Mark all numbers present in the array using a boolean array while finding the minimum and maximum values.
// Then iterate from min + 1 to max - 1 and collect the numbers that were not marked.
// Time Complexity: O(n + (max − min)) 
// Space Complexity: O(1) (fixed-size boolean array of size 101)
