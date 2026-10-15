class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size(), res = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                int k = set.size();
                res += (k * k);
            }
            set.clear();
        }
        return res;
    }
}

// Problem: Subarrays Distinct Element Sum of Squares I
// Problem Link: https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/
// Approach: Use each index i as the starting point of a subarray.Extend the subarray using j and add each element to a HashSet to track distinct elements and calculate the number of distinct elements.
// Time Complexity: O(n²) average, since there are O(n²) subarrays and HashSet operations take O(1) on average.
// Space Complexity: O(n) for the HashSet in the worst case.
