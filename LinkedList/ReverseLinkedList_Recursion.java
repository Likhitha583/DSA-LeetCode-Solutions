class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) 
            return head;
        ListNode ptr = reverseList(head.next);
            head.next.next = head;
            head.next = null;
        return ptr;
    }
}

// Problem: Reverse Linked List
// Problem Link: https://leetcode.com/problems/reverse-linked-list/
// Approach: Use recursion to reverse the remaining list first. After returning, make head.next.next = head to reverse the current link, then set head.next = null to avoid a cycle.
// Time Complexity: O(n)
// Space Complexity: O(n) due to the recursive call stack.
