class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathsum(root, 0, targetSum);
    }
    boolean pathsum(TreeNode root, int sum, int targetSum) {
        if (root == null) return false;
        sum += root.val;
        if (root.left == null && root.right == null) {
            return sum == targetSum;
        }
        return pathsum(root.left, sum, targetSum) ||
               pathsum(root.right, sum, targetSum);
    }
}

// Problem: Path Sum
// Problem Link: https://leetcode.com/problems/path-sum/
// Approach: Use DFS recursion to traverse every root-to-leaf path while maintaining the running sum. At each leaf node, check whether the accumulated sum equals the target sum.
// Time Complexity: O(n) (each node is visited exactly once)
// Space Complexity: O(h) (recursive call stack, where h is the height of the tree; worst case O(n), balanced tree O(log n)).
