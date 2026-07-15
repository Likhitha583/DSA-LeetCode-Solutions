class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        int depth = 0,s;
        q.offer(root);
        while(!q.isEmpty()){
            s = q.size();
            depth++;
            for(int i=0;i<s;i++){
                TreeNode t = q.poll();
                if(t.left != null)
                    q.offer(t.left);
                if(t.right != null)
                    q.offer(t.right);
            }
        }
        return depth;
    }
}

// Problem: Maximum Depth Of Binary Tree
// Problem Link: https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Approach: Perform Level Order Traversal (BFS) using a queue. Process the tree one level at a time, 
// incrementing the depth after each level until all nodes are visited.
// Time Complexity: O(n) (each node is visited exactly once)
// Space Complexity: O(n) (queue may store up to one level of the tree in the worst case)
