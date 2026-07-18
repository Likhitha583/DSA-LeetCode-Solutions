class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        postorder(root,res);
        return res;
    }
    private void postorder(TreeNode temp,List<Integer> res){
        if(temp == null) return;
        postorder(temp.left,res);
        postorder(temp.right,res);
        res.add(temp.val);
    }
}

// Problem: Binary Tree Postorder Traversal
// Problem Link: https://leetcode.com/problems/binary-tree-postorder-traversal/
// Approach: Use recursive postorder traversal. Visit the left subtree, then the right subtree, and finally the current node, storing each node's value in the result list.
// Time Complexity: O(n) (each node is visited exactly once)
// Space Complexity: O(h) (recursive call stack, where h is the height of the tree; worst case O(n), balanced tree O(log n)).
