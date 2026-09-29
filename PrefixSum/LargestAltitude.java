class Solution {
    public int largestAltitude(int[] gain) {
        int currsum = 0, maxht = 0;
        for (int i = 0; i < gain.length; i++) {
            currsum += gain[i];
            maxht = Math.max(maxht, currsum);
        }
        return maxht;
    }
}

// Problem: Find the Highest Altitude
// Problem Link: https://leetcode.com/problems/find-the-highest-altitude/
// Approach: Use a running sum to track the current altitude. Starting from altitude 0, add each gain and keep updating the maximum altitude reached.
// Time Complexity: O(n) — single traversal.
// Space Complexity: O(1) — only two variables are used.
