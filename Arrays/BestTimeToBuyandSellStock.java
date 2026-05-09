class Solution {
    public int maxProfit(int[] prices) {
    int profit,max=0,min = prices[0];
    for(int i=1;i<prices.length;i++){
        if(min> prices[i])
        min = prices[i];
        profit = prices[i] -min;
        if(profit>max)
            max = profit;
    }
    return(max);
    }
}

// Problem: Best Time to Buy and Sell Stock
// Problem Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
// Approach: Track minimum price and maximum profit
// Time Complexity: O(n)
// Space Complexity: O(1)