class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % k == 0) {
                set.add(nums[i]);
            }
        }
        int i = 1;
        while (set.contains(k * i))
            i++;
        return k * i;
    }
}

// Problem: Smallest Missing Multiple of K
// Problem Link: https://leetcode.com/problems/smallest-missing-multiple-of-k/
// Approach: Store all multiples of k present in nums using a HashSet. Starting from k, check each consecutive multiple until finding the first one that is missing.
// Time Complexity: O(n) average
// Space Complexity: O(n) for the HashSet.
