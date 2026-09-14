class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int left = (Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]));
        int right = (Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]));
        if (right > 0 && left > 0)
            return true;
        return false;
    }
}

// Problem: Rectangle Overlap
// Problem Link: https://leetcode.com/problems/rectangle-overlap/
// Approach: Calculate the overlapping width and height of the two rectangles. The overlap width is min(right edges) - max(left edges), and the overlap height is min(top edges) - max(bottom edges). If both are greater than 0, the rectangles have a positive-area overlap.
// Time Complexity: O(1)
// Space Complexity: O(1)
