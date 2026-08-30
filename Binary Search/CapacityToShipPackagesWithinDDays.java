class Solution {
    public boolean isValid(int[] weights, int n, int days) {
        int cnt = 1, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (sum + weights[i] <= n)
                sum += weights[i];
            else {
                cnt++;
                sum = weights[i];
            }
        }
        return cnt <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0, mid, res = 0;
        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (isValid(weights, mid, days)) {
                res = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return res;
    }
}

// Problem: Capacity To Ship Packages Within D Days
// Problem Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
// Approach: Apply binary search on the ship capacity from the maximum single package weight to the total weight. For each capacity, greedily load packages in order and count the required days; if it fits within days, try a smaller capacity.
// Time Complexity: O(n log(sum(weights)))
// Space Complexity: O(1)
