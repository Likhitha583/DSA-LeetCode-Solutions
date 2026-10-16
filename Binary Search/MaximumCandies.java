class Solution {
    boolean isValid(int[] c, int n, long k, int mid) {
        for (int i = 0; i < n; i++) {
            k -= (c[i] / mid);
            if (k <= 0)
                return true;
        }
        return false;
    }

    public int maximumCandies(int[] candies, long k) {
        int n = candies.length, low = 1, high = 0, mid, ans = 0;
        for (int i : candies)
            high = Math.max(high, i);
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (isValid(candies, n, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }
}

// Problem: Maximum Candies Allocated to K Children
// Problem Link: https://leetcode.com/problems/maximum-candies-allocated-to-k-children/
// Approach: Binary search on the maximum candies per child. For each mid, check whether Σ(candies[i] / mid) >= k; if valid, search for a larger value.
// Time Complexity: O(n log M), where M is the maximum pile size.
// Space Complexity: O(1).
