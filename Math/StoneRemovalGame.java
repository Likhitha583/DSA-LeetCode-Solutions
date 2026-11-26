class Solution {
    public boolean canAliceWin(int n) {
        int k = 10;
        while (n >= k) {
            n -= k;
            k--;
        }
        return (k % 2 != 0);
    }
}

// Problem: Stone Removal Game
// Problem Link:https: //leetcode.com/problems/stone-removal-game/
// Approach: Start with k = 10 and alternately subtract decreasing values from n. After each subtraction, decrement k. If the next required value is odd, Alice wins; otherwise, Bob wins.
// Time Complexity: O(1) — at most 10 iterations.
// Space Complexity: O(1)
