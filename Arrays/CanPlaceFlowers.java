class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;
        int l = flowerbed.length;
        for (int i = 0; i < l; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == l - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n -= 1;
            }
            if (n == 0)
                return true;
        }
        return false;
    }
}

// Problem: Can Place Flowers 
// Problem Link: https://leetcode.com/problems/can-place-flowers/
// Approach: Traverse the flowerbed greedily. If the current position and its adjacent positions are empty (or boundaries), plant a flower and decrement n. Return true once all required flowers are planted.
// Time Complexity: O(n)
// Space Complexity: O(1)
