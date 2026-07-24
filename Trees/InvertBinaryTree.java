class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int s,t;
        TreeNode temp,node;
        while(!q.isEmpty()){
            s = q.size();
            for(int i = 0;i<s;i++){
                temp = q.remove();
                    node = temp.left;
                    temp.left = temp.right;
                    temp.right = node;
                    if(temp.left!= null)q.offer(temp.left);
                    if(temp.right != null)q.offer(temp.right);
            }
        }
    return root;
    }
}

// Problem: Invert Binary Tree
// Problem Link: https://leetcode.com/problems/invert-binary-tree/
// Approach: Perform Breadth-First Search (BFS) using a queue. For each node, swap its left and right children,
// then enqueue the non-null children until all nodes are processed.
// Time Complexity: O(n) (each node is visited exactly once)
// Space Complexity: O(n) (queue stores nodes level by level in the worst case)
