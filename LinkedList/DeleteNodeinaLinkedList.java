class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

// Problem: Delete Node in a Linked List
// Problem Link: https://leetcode.com/problems/delete-node-in-a-linked-list/
// Approach: Since the previous node is not given, copy the next node’s value into the current node, then bypass the next node by updating node.next.
// Time Complexity: O(1)
// Space Complexity: O(1)
