class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        if (height(root) == -1)
            return false;
        return true;
    }

    public int height(TreeNode root) {
        if (root == null)
            return 0;
        int lht = height(root.left);
        if (lht == -1)
            return -1;
        int rht = height(root.right);
        if (rht == -1)
            return -1;
        if (Math.abs(lht - rht) > 1)
            return -1;
        return 1 + Math.max(lht, rht);
    }
}

// Problem: Balanced Binary Tree
// Problem Link: https://leetcode.com/problems/balanced-binary-tree/
// Approach: Use bottom-up DFS to calculate the height of each subtree. If any subtree is unbalanced, return -1 immediately; otherwise, return its height and check whether the left/right height difference is at most 1.
// Time Complexity: O(n) (each node is visited once)
// Space Complexity: O(h) (recursion stack, where h is the tree height; worst case O(n)).
