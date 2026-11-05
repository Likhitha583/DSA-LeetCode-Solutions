class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt = 0, res = 0;
        for (int i = 0; i < arr1.length; i++) {
            cnt = 0;
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) <= d)
                    cnt++;
            }
            if (cnt == 0)
                res++;
        }
        return res;
    }
}

// Problem: Find the Distance Value Between Two Arrays
// Problem Link: https://leetcode.com/problems/find-the-distance-value-between-two-arrays/
// Approach: For each element in arr1, compare it with every element in arr2. If no element in arr2 has an absolute difference less than or equal to d, increment the result.
// Time Complexity: O(n × m), where n = arr1.length and m = arr2.length.
// Space Complexity: O(1)
