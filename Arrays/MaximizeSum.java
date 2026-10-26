class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length, i = n - 1;
        long sum = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while (i >= 0) {
            sum += nums[i];
            ArrayList<Integer> a = new ArrayList<>();
            int num = nums[i];
            while (num > 0) {
                a.add(num % 10);
                num /= 10;
            }
            Collections.sort(a);
            num = 0;
            for (int j = a.size() - 1; j >= 0; j--)
                num = num * 10 + a.get(j);
            res.add(num - nums[i]);
            i--;
        }
        Collections.sort(res);
        i = n - 1;
        while (i >= 0 && k-- > 0) {
            sum += res.get(i);
            i--;
        }
        return sum;
    }
}

// Problem: Maximize Sum After At Most K Digit Rearrangements
// Problem Link: https://leetcode.com/problems/maximize-sum-after-at-most-k-digit-rearrangements/
// Approach: Calculate the initial sum and find each number’s maximum digit-rearranged value by sorting its digits in descending order. Store the gain (rearranged value - original value), sort the gains, and add the largest k gains to the sum.
// Time Complexity: O(n log n + n × d log d), where d is the maximum number of digits.
// Space Complexity: O(n + d), for the gain list and temporary digit list.
