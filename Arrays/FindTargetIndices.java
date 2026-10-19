class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        int l = 0, c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < target)
                l++;
            else if (nums[i] == target)
                c++;
        }
        while (c-- > 0)
            res.add(l++);
        return res;
    }
}

// Problem: Find Target Indices After Sorting Array
// Problem Link: https://leetcode.com/problems/find-target-indices-after-sorting-array/
// Approach: Count elements smaller than target (l) and occurrences of target (c). Add c consecutive indices starting from l to the result.
// Time Complexity: O(n)
// Space Complexity: O(c) for the result list, where c is the number of occurrences of target.
