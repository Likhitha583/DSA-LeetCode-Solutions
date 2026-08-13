class Solution {
    int prev = Integer.MIN_VALUE;
    boolean res = true,vis = false;
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return res;
        isValidBST(root.left);
        if(!vis)
            vis = true;
        else if(prev >= root.val){
            res = false;
            return res;
        }
        prev = root.val;
        isValidBST(root.right);
        return res;
    }
}

// Problem: Validate Binary Search Tree 
// Problem Link: https://leetcode.com/problems/validate-binary-search-tree/
// Approach: Use inorder traversal of the BST. A valid BST produces a strictly increasing sequence, so compare each node's value with the previously visited value; if prev >= root.val, the tree is invalid.
// Time Complexity: O(n) (each node is visited once)
// Space Complexity: O(h) (recursive call stack, where h is the tree height; worst case O(n)).
