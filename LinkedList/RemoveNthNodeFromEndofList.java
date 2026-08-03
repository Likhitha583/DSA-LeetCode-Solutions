class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1)
            return null;
        ListNode ptr = head, temp = head;
        int c = 0;
        while (c <= n && ptr != null) {
            ptr = ptr.next;
            c += 1;
            if (ptr == null && c <= n)
                return head.next;
        }
        while (ptr != null) {
            temp = temp.next;
            ptr = ptr.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

// Problem: Remove Nth Node From End of List
// Problem Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Approach: Use the two-pointer technique by moving the fast pointer n+1 steps ahead. Then move both fast and slow pointers together until fast reaches the end, allowing slow to delete the nth node from the end.
// Time Complexity: O(n) (single traversal of the linked list)
// Space Complexity: O(1) (uses only constant extra space)
