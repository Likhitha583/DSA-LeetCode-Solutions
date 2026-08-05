class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = null, pre = null, ptr = head, head1 = null, head2 = null;
        while (ptr != null) {
            if (ptr.val < x) {
                if (head1 == null) {
                    temp = ptr;
                    head1 = temp;
                } else {
                    temp.next = ptr;
                    temp = temp.next;
                }
            } else {
                if (head2 == null) {
                    pre = ptr;
                    head2 = pre;
                } else {
                    pre.next = ptr;
                    pre = pre.next;
                }
            }
            ptr = ptr.next;
        }
        if (temp != null)
            temp.next = head2;
        if (pre != null)
            pre.next = null;
        return head1 == null ? head2 : head1;
    }
}

// Problem: Partition List
// Problem Link: https://leetcode.com/problems/partition-list/
// Approach: Traverse the linked list once and split nodes into two separate lists: one with values less than x and another with values greater than or equal to x. Finally, connect the two lists while preserving the original relative order.
// Time Complexity: O(n) (single traversal of the linked list)
// Space Complexity: O(1) (only a few pointer variables are used)
