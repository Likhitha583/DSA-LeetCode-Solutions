class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        int s;
        TreeNode temp;
        while(q.size() != 0){
            List<Integer> arr = new ArrayList<>();
            s = q.size();
            for(int i = 0;i<s;i++){
                temp = q.remove();
                if(temp.val != 101){
                if(temp.left != null){
                    q.add(temp.left);
                    arr.add(temp.left.val);
                }
                else
                    arr.add(101);
                if(temp.right != null){
                   q.add(temp.right);
                    arr.add(temp.right.val);}
                else
                    arr.add(101);
                }
            }
            int i = 0,j= arr.size()-1;
            while(i<=j){
                if(arr.get(i) != arr.get(j)){
                    return false;
                }
                i++;
                j--;   
            }
        }
        return true;
    }
}

// Problem: Symmetric Tree
// Problem Link: https://leetcode.com/problems/symmetric-tree/
// Approach: Perform level-order traversal (BFS) using a queue. For each level, store the left and right child values 
// (using a placeholder for null), then check if the collected list is a palindrome to verify symmetry.
// Time Complexity: O(n) (each node is visited once)
// Space Complexity: O(n) (queue and level list store up to n elements in the worst case)
