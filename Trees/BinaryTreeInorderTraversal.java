class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }
    private void inorder(TreeNode temp,List<Integer> res){
        if(temp == null) return;
        inorder(temp.left,res);
        res.add(temp.val);
        inorder(temp.right,res);
    }
}

// Problem: Binary Tree Inorder Traversal
// Problem Link: https://leetcode.com/problems/binary-tree-inorder-traversal/
// Approach: Use recursive inorder traversal. Visit the left subtree, then the current node, and finally the right 
// subtree, storing each node's value in the result list.
// Time Complexity: O(n) (each node is visited exactly once)
// Space Complexity: O(h) (recursive call stack, where h is the height of the tree; worst case O(n),
// balanced tree O(log n)).
