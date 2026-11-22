class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length, al = 0, b = 0;
        String[] res = new String[n];
        for (int i = 0; i < n - 1; i++) {
            if (rain[i] == 1 && rain[i] == rain[i + 1]) {
                if (al > b) {
                    res[i] = "Bob";
                    b++;
                } else {
                    res[i] = "Alice";
                    al++;
                }
            } else if (rain[i] == 1) {
                res[i] = "Bob";
                b++;
            } else
                res[i] = "None";
        }
        if (rain[n - 1] == 1)
            res[n - 1] = "Bob";
        else
            res[n - 1] = "None";
        return res;
    }
}

// Problem: Assign Umbrella on Rainy Days
// Problem Link: https://leetcode.com/problems/assign-umbrella-on-rainy-days/
// Approach: Traverse the rain array and assign "Alice" or "Bob" based on the current and next day's rain conditions. For consecutive rainy days, assign the umbrella to balance the number of assignments between Alice and Bob. Assign "None" on non-rainy days.
// Time Complexity: O(n)
// Space Complexity: O(n) (result array), O(1) auxiliary space.
