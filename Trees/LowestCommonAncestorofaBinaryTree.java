class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left == null && right == null)
            return null;
        else if (left == null)
            return right;
        else if (right == null)
            return left;
        return root;
    }
}

// Problem: Lowest Common Ancestor of a Binary Tree
// Problem Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Approach: Use Postorder DFS to find the Lowest Common Ancestor (LCA). Recursively search both left and right subtrees. If the current node is p or q, return it. If both left and right recursive calls return non-null nodes, the current root is the LCA. Otherwise, return whichever side contains a node.
// Time Complexity: O(n) — each node is visited at most once.
// Space Complexity: O(h) — recursion stack, where h is the height of the tree. Worst case: O(n), balanced tree: O(log n).
