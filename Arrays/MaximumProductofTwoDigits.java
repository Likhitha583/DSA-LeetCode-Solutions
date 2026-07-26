class Solution {
    public int maxProduct(int n) {
        int fmax = -1,smax = 0,r;
        while(n > 0){
            r = n%10;
            if(r >= fmax && r >= smax){
                smax = fmax;
                fmax = r;
            }
            if(fmax > r && r> smax)
                smax = r;
            n/= 10;
        }
        return fmax*smax;
    }
}

// Problem: Maximum Product of Two Digits
// Problem Link: https://leetcode.com/problems/maximum-product-of-two-digits/
// Approach: Traverse the digits of the number once to find the largest and second-largest digits. Return the product of these two maximum digits.
// Time Complexity: O(d), where d is the number of digits in n.
// Space Complexity: O(1).
