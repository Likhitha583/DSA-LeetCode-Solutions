class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) 
            return null;
        ListNode fast = head.next,slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}

// Problem: Delete the Middle Node of a Linked List
// Problem Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
// Approach: Use the slow and fast pointer technique to find the node before the middle. Move slow by one step and fast by two steps, then delete the middle node by updating slow.next.
// Time Complexity: O(n) (single traversal of the linked list)
// Space Complexity: O(1) (uses only two pointers)
