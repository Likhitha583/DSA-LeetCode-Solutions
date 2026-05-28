class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int startidx = 0, idx = 0, end = 0;
        int[][] res = new int[intervals.length][2];
        for (int i = 0; i < intervals.length; i++) {
            end = intervals[i][1];
            startidx = i;
            while (i < intervals.length - 1 && end >= intervals[i + 1][0]) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }
            res[idx][0] = intervals[startidx][0];
            res[idx][1] = end;
            idx++;
        }
        int[][] ans = new int[idx][2];
        for (int i = 0; i < idx; i++)
            ans[i] = res[i];
        return ans;
    }
}

// Problem: Merge Intervals
// Problem Link: https://leetcode.com/problems/merge-intervals/
// Approach: Sort the matrix based on first column.
// Traverse the sorted intervals and merge overlapping intervals 
// by updating the ending value with the maximum end encountered.
// Time Complexity: O(NlogN) Sorting requires O(NlogN) time.Merging takes O(N).
// Space Complexity: O(N) Extra array for storing intervals.
