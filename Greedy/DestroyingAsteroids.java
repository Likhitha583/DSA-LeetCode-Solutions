class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long ans = mass;
        int cnt[] = new int[100001];
        for (int a : asteroids)
            cnt[a]++;
        for (int i = 0; i <= 100000; i++) {
            if (i <= ans)
                ans += (1L * cnt[i] * i);
            else if (cnt[i] != 0)
                return false;
        }
        return true;
    }
}

// Problem: Destroying Asteroids
// Problem Link: https://leetcode.com/problems/destroying-asteroids/
// Approach: Use a frequency array to process asteroids in increasing order of size. cnt[i] stores how many asteroids have mass i. If the current asteroid mass i is less than or equal to ans, all asteroids of that mass can be destroyed, so add their total mass to ans. If i > ans and such an asteroid exists, it cannot be destroyed, so return false. long is used to prevent overflow.
// Time Complexity: O(n + M), where M = 100000 (maximum asteroid mass).
// Space Complexity: O(M) for the frequency array.
