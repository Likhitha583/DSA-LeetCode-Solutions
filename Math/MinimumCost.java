class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long low = Math.min(need1,need2);
        return low*Math .min(costBoth,cost1+cost2) + (need1-low)*Math.min(costBoth,cost1) + (need2-low)*Math.min(costBoth,cost2);
    }
}

// Problem: Minimum Cost to Acquire Required Items
// Problem Link: https://leetcode.com/problems/minimum-cost-to-acquire-required-items/
// Approach: Use a greedy strategy by satisfying the common requirement (min(need1, need2)) using the cheaper option between costBoth and cost1 + cost2. Then satisfy the remaining individual requirements using the cheaper option between the combined cost and the respective individual cost.
// Time Complexity: O(1)
// Space Complexity: O(1)
