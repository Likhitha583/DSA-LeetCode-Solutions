class Solution {
    public int minRotations(String s) {
        int total = 0, curr = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int t = Math.abs((c - '0') - curr);
            total += Math.min(t, 10 - t);
            curr = c - '0';
        }
        return total;
    }
}

// Problem: Minimum Rotations to Dial a Number I
// Problem Link: https://leetcode.com/contest/weekly-contest-522/problems/minimum-rotations-to-dial-a-number-i/
// Approach: Use a Greedy approach by processing each digit sequentially. Keep curr as the current digit, calculate the direct rotation distance t to the next digit, and choose the minimum between clockwise and counterclockwise rotations: min(t, 10 - t). Add this to the total and update curr.
// Time Complexity: O(n) — each character is processed once.
// Space Complexity: O(1) — only a few variables are used.
