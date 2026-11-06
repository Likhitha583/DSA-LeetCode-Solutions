class Solution {
    public int maxLevelSum(TreeNode root) {
        int level = 0, l = 0, sum = 0, maxsum = Integer.MIN_VALUE, s;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while (!q.isEmpty()) {
            s = q.size();
            sum = 0;
            l++;
            for (int i = 0; i < s; i++) {
                TreeNode curr = q.poll();
                sum += curr.val;
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
            }
            if (sum > maxsum) {
                maxsum = sum;
                level = l;
            }
        }
        return level;
    }
}

// Problem: Maximum Level Sum of a Binary Tree
// Problem Link: https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
// Approach: Use Level Order Traversal (BFS) with a queue. Calculate the sum of nodes at each level and update the maximum sum and its corresponding level whenever a larger sum is found.
// Time Complexity: O(n), where n is the number of nodes.
// Space Complexity: O(w), where w is the maximum width of the binary tree (queue space).
