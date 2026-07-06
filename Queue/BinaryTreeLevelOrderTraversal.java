class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> arr = new ArrayList<>();
        if (root == null)
            return arr;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int s = q.size();
            ArrayList<Integer> li = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                TreeNode temp = q.poll();
                li.add(temp.val);
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            arr.add(li);
        }
        return arr;
    }
}

// Problem: Binary Tree Level Order Traversal
// Problem Link: https://leetcode.com/problems/binary-tree-level-order-traversal/
// Approach: Perform Breadth-First Search (BFS) using a queue. Process one level at a time by iterating over the current 
// queue size, collect node values for that level, and enqueue their children.
// Time Complexity: O(n) (each node is visited exactly once)
// Space Complexity: O(n) (queue and result list together can store up to all nodes)
