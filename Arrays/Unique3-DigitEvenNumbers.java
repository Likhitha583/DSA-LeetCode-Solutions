class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int x : digits)
            freq[x]++;
        int ans = 0;
        for (int i = 1; i <= 9; i++) {
            if (freq[i] == 0)
                continue;
            freq[i]--;
            for (int j = 0; j <= 9; j++) {
                if (freq[j] == 0)
                    continue;
                freq[j]--;
                for (int k = 0; k <= 8; k += 2)
                    if (freq[k] > 0)
                        ans++;
                freq[j]++;
            }
            freq[i]++;
        }
        return ans;
    }
}

// Problem: Unique 3-Digit Even Numbers
// Problem Link: https://leetcode.com/problems/unique-3-digit-even-numbers/
// Approach: Use a frequency array to count available digits. Choose the first digit from 1–9 (cannot be zero), then choose the second digit from the remaining digits. Finally, choose an even third digit (0, 2, 4, 6, 8) from the remaining frequency. Decrease frequencies while selecting digits and restore them afterward so every valid combination is counted without reusing a digit.
// Time Complexity: O(10 × 10 × 5) = O(1) — the digit range is fixed.
// Space Complexity: O(10) = O(1) — frequency array of size 10.
