class Solution {
    int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    int lcm(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        return (a / gcd(a, b)) * b;
    }

    public int maxLength(int[] nums) {
        int n = nums.length, maxlen = 0, l, g;
        long pro = 1;
        for (int i = 0; i < n; i++) {
            pro = 1;
            l = nums[i];
            g = nums[i];
            for (int j = i; j < n; j++) {
                pro *= nums[j];
                l = lcm(l, nums[j]);
                g = gcd(g, nums[j]);
                if (pro == (long) l * g)
                    maxlen = Math.max(maxlen, j - i + 1);
            }
        }
        return maxlen;
    }
}

// Problem: Maximum Subarray With Equal Products
// Problem Link: https://leetcode.com/problems/maximum-subarray-with-equal-products/
// Approach: Use nested loops to generate all subarrays. Maintain the product, LCM, and GCD incrementally for each subarray. If the product equals LCM × GCD, update the maximum length.
// Time Complexity: O(n² log M), where M is the maximum array element (for GCD/LCM calculations).
// Space Complexity: O(1)
