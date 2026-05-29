class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int len = 0, curr, max = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                curr = num;
                len = 1;
                while (set.contains(curr + 1)) {
                    curr += 1;
                    len += 1;

                }
                max = Math.max(max, len);
            }
        }
        return max;
    }
}

// Problem: Longest Consecutive Sequence 
// Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/
// Approach: Use a HashSet to efficiently detect sequence starts (num-1 absent) 
// and expand forward to find the longest consecutive sequence length in O(n) time.
// Time Complexity: O(N) Traverses the entire array once.
// Space Complexity: O(N) Extra space for HashSet.
