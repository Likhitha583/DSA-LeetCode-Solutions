class Solution {
    public int countDominantElements(int[] nums) {
        int n = nums.length, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && i > 0) {
                if (nums[i] >= (nums[i + 1] + nums[i - 1]) / 2.0)
                    cnt++;
            } else if (i == 0 && i < n - 1) {
                if (nums[i] >= nums[i + 1])
                    cnt++;
            } else if (i > 0 && i < n) {
                if (nums[i - 1] <= nums[i])
                    cnt++;
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}

// Problem: Count Dominant Elements
// Problem Link: https://leetcode.com/problems/count-dominant-elements/
// Approach: Traverse the array and check each element against its neighboring elements. For middle elements, compare with the ceiling of the average of its neighbors. For the first and last elements, compare with their single adjacent element.
// Time Complexity: O(n)
// Space Complexity: O(1)
