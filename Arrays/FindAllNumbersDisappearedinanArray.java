class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int k = Math.abs(nums[i]) - 1;
            if (nums[k] > 0)
                nums[k] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                res.add(i + 1);
        }
        return res;
    }
}

// Problem: Find All Numbers Disappeared in an Array
// Problem Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Approach: Use the array itself as a marking mechanism. For each number, mark the element at index abs(nums[i]) - 1 as negative. After marking, positive elements indicate the missing numbers.
// Time Complexity: O(n)
// Space Complexity: O(1) auxiliary space (excluding the output list).
