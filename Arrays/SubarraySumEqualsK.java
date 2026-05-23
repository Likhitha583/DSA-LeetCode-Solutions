class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                cnt += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return cnt;
    }
}

// Problem: Subarray Sum Equals K
// Problem Link: https://leetcode.com/problems/subarray-sum-equals-k/
// Approach: Storing the prefix sum and frequency in the Hashmap and retrieving the frequency of the complement of required value from Hashmap.
// Time Complexity: O(N) Traverse the entire array once.
// Space Complexity: O(N) for HashMap.
