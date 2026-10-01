class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0, z = 0, maxlen = 0, n = nums.length;
        while (j < n) {
            if (nums[j] == 0)
                z++;
            while (z > k) {
                if (nums[i] == 0)
                    z--;
                i++;
            }
            maxlen = Math.max(maxlen, j - i + 1);
            j++;
        }
        return maxlen;
    }
}

// Problem: Max Consecutive Ones III
// Problem Link: https://leetcode.com/problems/max-consecutive-ones-iii/
// Approach: Use a Sliding Window to find the longest subarray containing at most k zeros. Expand the window with j and count zeros. When the number of zeros exceeds k, move i forward until the window becomes valid again. Track the maximum valid window length.
// Time Complexity: O(n) — each element is added and removed from the window at most once.
// Space Complexity: O(1) — only a few variables are used.
