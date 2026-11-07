class Solution {
    public int helper(TreeNode root) {
        if (root.left == null)
            return root.val;
        return helper(root.left);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;
        if (root.val == key) {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                int min = helper(root.right);
                root.val = min;
                root.right = deleteNode(root.right, min);
            }
            return root;
        } else if (root.val > key)
            root.left = deleteNode(root.left, key);
        else
            root.right = deleteNode(root.right, key);
        return root;
    }
}

// Problem: Delete Node in a BST
// Problem Link: https://leetcode.com/problems/delete-node-in-a-bst/
// Approach: Use recursion to search for the node with the given key. Handle three cases: no children (delete the node), one child (replace it with its child), and two children (replace its value with the inorder successor—the minimum value in the right subtree—and delete that successor).
// Time Complexity: O(h), where h is the height of the BST.
// Space Complexity: O(h) due to recursive call stack.
// • Balanced BST: O(log n) • Skewed BST: O(n)
