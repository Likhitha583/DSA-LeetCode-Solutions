class Solution {
    int min = Integer.MAX_VALUE, prev = -1;
    public int getMinimumDifference(TreeNode root) {
        if (root == null)
            return min;
        getMinimumDifference(root.left);
        if (prev != -1)
            min = Math.min(min, root.val - prev);
        prev = root.val;
        getMinimumDifference(root.right);
        return min;
    }
}

// Problem: Minimum Absolute Difference in BST
// Problem Link: https://leetcode.com/problems/minimum-absolute-difference-in-bst/
// Approach: Perform an inorder traversal of the BST, which visits nodes in sorted order. Compare each node's value with the previously visited node and update the minimum difference.
// Time Complexity: O(n), where n is the number of nodes.
// Space Complexity: O(h) due to the recursive call stack, where h is the tree height.
