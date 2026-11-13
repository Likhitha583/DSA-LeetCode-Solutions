import java.util.Random;
class Solution {
    int quickselect(int[] nums, int k) {
        Random rand = new Random();
        int n = nums.length - 1, lt = 0, rt = n, idx, p;
        while (lt <= rt) {
            p = rand.nextInt(rt - lt + 1) + lt;
            int temp = nums[rt];
            nums[rt] = nums[p];
            nums[p] = temp;
            idx = lt;
            for (int i = lt; i < rt; i++) {
                if (nums[i] < nums[rt]) {
                    temp = nums[i];
                    nums[i] = nums[idx];
                    nums[idx] = temp;
                    idx++;
                }
            }
            temp = nums[idx];
            nums[idx] = nums[rt];
            nums[rt] = temp;
            if (idx == k)
                return nums[k];
            else if (idx < k)
                lt = idx + 1;
            else
                rt = idx - 1;
        }
        return 0;
    }
    public int minMoves2(int[] nums) {
        int n = nums.length, res = 0;
        int val = quickselect(nums, n / 2);
        for (int i = 0; i < n; i++) {
            res += Math.abs(nums[i] - val);
        }
        return res;
    }
}

// Problem: Minimum Moves to Equal Array Elements II
// Problem Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/
// Approach: Use randomized Quickselect to find the median (the n/2-th smallest element) without fully sorting the array. Calculate the total absolute difference between every element and the median, which gives the minimum number of moves.
// Time Complexity: O(n) average, O(n²) worst case.
// Space Complexity: O(1) auxiliary space.
