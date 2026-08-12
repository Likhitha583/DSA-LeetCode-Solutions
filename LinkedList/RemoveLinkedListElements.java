class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        if(head == null) return head;
        ListNode pre = head,ptr = head.next;
        while(ptr != null){
            if(pre.next.val == val)
                pre.next = ptr.next;
            else 
                pre = ptr;
            ptr = ptr.next;
        }
        return head;
    }
}

// Problem: Remove Linked List Elements
// Problem Link: https://leetcode.com/problems/remove-linked-list-elements/
// Approach: Traverse the linked list while first removing matching nodes from the beginning. Then use two pointers to skip any node whose value equals val by updating the previous node’s next pointer.
// Time Complexity: O(n) (single traversal of the linked list)
// Space Complexity: O(1) (only constant extra pointers are used)
