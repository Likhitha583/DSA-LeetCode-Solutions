class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++)
            hs.add(nums[i]);
        for (int i = lower; i <= upper; i++) {
            if (!hs.contains(i))
                l.add(i);
        }
        int i = 0;
        while (i < l.size() - 1) {
            int k = l.get(i);
            while (i < l.size() - 1 && l.get(i) + 1 == l.get(i + 1))
                i++;
            res.add(new ArrayList<>(List.of(k, l.get(i))));
            i++;
        }
        if (i == l.size() - 1)
            res.add(new ArrayList<>(List.of(l.get(i), l.get(i))));
        return res;
    }
}

// Problem: Find All Numbers Disappeared in an Array II
// Problem Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array-ii/
// Approach: Store all present values in a HashSet, then find missing values within [lower, upper]. Group consecutive missing values into [start, end] ranges and add them to the result.
// Time Complexity: O(n + (upper − lower + 1))
// Space Complexity: O(n + (upper − lower + 1)) for the HashSet and missing-value list.
