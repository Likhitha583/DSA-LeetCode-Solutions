class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null)
            return 1 + minDepth(root.right);
        if (root.right == null)
            return 1 + minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}

// Problem: Minimum Depth of Binary Tree
// Problem Link: https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Approach: Use recursion to compute the minimum depth. If one child is null, recurse on the other child; otherwise, return 1 + min(leftDepth, rightDepth).
// Time Complexity: O(n) (each node is visited once)
// Space Complexity: O(h) (recursive call stack, where h is the height of the tree; worst case O(n), balanced tree O(log n)).
