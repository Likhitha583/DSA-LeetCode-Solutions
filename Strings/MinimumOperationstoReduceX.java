class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length, sum = 0, j = 0, s = 0, maxlen = 0;
        for (int num : nums)
            sum += num;
        sum -= x;
        if (sum < 0)
            return -1;
        if (sum == 0)
            return n;
        for (int i = 0; i < n; i++) {
            s += nums[i];
            while (s > sum)
                s -= nums[j++];
            if (s == sum)
                maxlen = Math.max(maxlen, i - j + 1);
        }
        return maxlen == 0 ? -1 : n - maxlen;
    }
}

// Problem: Minimum Operations to Reduce X to Zero
// Problem Link: https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/
// Approach: Use Sliding Window. Instead of removing elements from the ends whose sum is x, find the longest subarray whose sum is totalSum - x. Since all elements are positive, expand the window with i and shrink it from the left while its sum exceeds the target. If a valid window is found, the required operations are n - maxlen.
// Time Complexity: O(n) — each element enters and leaves the sliding window at most once.
// Space Complexity: O(1) — only a few variables are used.
