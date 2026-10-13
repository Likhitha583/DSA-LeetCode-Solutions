class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;
        if (root.val == val)
            return root;
        if (val < root.val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
}

// Problem: Search in a Binary Search Tree
// Problem Link: https://leetcode.com/problems/search-in-a-binary-search-tree/
// Approach: Use Binary Search Tree (BST) property. If the current node is null or its value matches val, return it. If val is smaller than the current node's value, search the left subtree; otherwise, search the right subtree.
// Time Complexity: O(h) — where h is the height of the BST.
// Space Complexity: O(h) — due to the recursive call stack.
