class Solution {
    public int[] rearrangeArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++)
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        List<Integer> m = new ArrayList<>(map.keySet());
        int i = 0;
        Collections.sort(m);
        while (i < n) {
            for (int num : m) {
                if (i < n && map.get(num) > 0) {
                    nums[i++] = num;
                    map.put(num, map.get(num) - 1);
                }
            }
        }
        return nums;
    }
}

// Problem: Rearrange Array by Removing Distinct Values
// Problem Link: https://leetcode.com/problems/rearrange-array-by-removing-distinct-values/
// Approach: Use a HashMap + sorted unique values. Count the frequency of each number, sort the unique values, then repeatedly traverse the sorted list and place each available number back into nums while decreasing its frequency.
// Time Complexity: O(n + u log u + n × u), where u is the number of unique elements.
// Space Complexity: O(n) — for the HashMap and list of unique elements.
