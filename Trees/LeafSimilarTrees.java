class Solution {
    void dfs(TreeNode root, ArrayList<Integer> arr) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            arr.add(root.val);
            return;
        }
        dfs(root.left, arr);
        dfs(root.right, arr);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        dfs(root1, arr1);
        dfs(root2, arr2);
        if (arr1.size() != arr2.size())
            return false;
        for (int i = 0; i < arr1.size(); i++) {
            if (!arr1.get(i).equals(arr2.get(i)))
                return false;
        }
        return true;
    }
}

// Problem: Leaf-Similar Trees
// Problem Link: https://leetcode.com/problems/leaf-similar-trees/
// Approach: Perform DFS traversal on both binary trees and store their leaf node values from left to right in separate lists. Compare the two lists element by element. If they match, the trees are leaf-similar.
// Time Complexity: O(n + m), where n and m are the number of nodes in the two trees.
// Space Complexity: O(L₁ + L₂ + h₁ + h₂), where L₁ and L₂ are the number of leaves and h₁ and h₂ are the tree heights.
