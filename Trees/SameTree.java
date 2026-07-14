class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        Queue<TreeNode> q1 = new ArrayDeque<>();
        Queue<TreeNode> q2 = new ArrayDeque<>();
        q1.offer(p);
        q2.offer(q);
        while (!q1.isEmpty() && !q2.isEmpty()) {
            int s = q1.size();
            for (int i = 0; i < s; i++) {
                TreeNode temp1 = q1.poll();
                TreeNode temp2 = q2.poll();
                if (temp1.val != temp2.val)
                    return false;
                if ((temp1.left != null && temp2.left == null) || (temp1.left == null && temp2.left != null))
                    return false;
                if (temp1.right != null && temp2.right == null || (temp1.right == null && temp2.right != null))
                    return false;
                if (temp1.left != null)
                    q1.offer(temp1.left);
                if (temp1.right != null)
                    q1.offer(temp1.right);
                if (temp2.left != null)
                    q2.offer(temp2.left);
                if (temp2.right != null)
                    q2.offer(temp2.right);

            }
        }
        return true;
    }
}

// Problem: Same Tree
// Problem Link: https://leetcode.com/problems/same-tree/
// Approach: Perform BFS simultaneously on both trees using two queues. At each step, compare the current nodes' values
// and check whether their left and right children have the same structure before enqueueing them.
// Time Complexity: O(n), where n is the number of nodes (each node is visited once).
// Space Complexity: O(n) (queues store nodes level by level in the worst case).
