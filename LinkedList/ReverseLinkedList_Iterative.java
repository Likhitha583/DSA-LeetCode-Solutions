class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode ptr = head.next,pre = null;
        while(ptr != null){
            head.next = pre;
            pre = head;
            head = ptr;
            ptr = ptr.next;
        }
        head.next = pre;
        return head;
    }
}

// Problem: Reverse Linked List
// Problem Link: https://leetcode.com/problems/reverse-linked-list/
// Approach: Reverse the linked list iteratively using three pointers: pre, head, and ptr. Reverse each next pointer as you move forward, then return the new head.
// Time Complexity: O(n)
// Space Complexity: O(1)
