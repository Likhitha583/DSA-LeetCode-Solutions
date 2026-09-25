class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt = 0, n = nums.length;
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (int i = 0; i < n; i++) {
            int val = k - nums[i];
            if (map.containsKey(val) && map.get(val) > 0 && map.get(nums[i]) > 0) {
                if (val == nums[i]) {
                    if (map.get(val) >= 2) {
                        map.put(nums[i], map.get(nums[i]) - 2);
                        cnt++;
                    }
                } else {
                    map.put(nums[i], map.get(nums[i]) - 1);
                    map.put(val, map.get(val) - 1);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

// Problem: Max Number of K-Sum Pairs
// Problem Link: https://leetcode.com/problems/max-number-of-k-sum-pairs/
// Approach: Use a HashMap frequency table to store the count of each number. For every element, find its complement k - nums[i]; if both values are available, consume one occurrence of each (or two when both values are equal) and increment the operation count.
// Time Complexity: O(n) average — HashMap operations are O(1) on average.
// Space Complexity: O(n) — for storing the frequencies in the HashMap.
