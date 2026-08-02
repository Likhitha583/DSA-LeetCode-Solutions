class Solution {
    public ListNode reverse(ListNode head) {
        ListNode pre = null, temp = head, curr = head.next;
        while (temp.next != null) {
            temp.next = pre;
            pre = temp;
            temp = curr;
            curr = curr.next;
        }
        temp.next = pre;
        return temp;
    }

    public void reorderList(ListNode head) {
        if (head.next == null)
            return;
        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode temp = head, ptr1 = head.next, ptr2 = head2.next;
        while (ptr1 != null && ptr2 != null) {
            temp.next = head2;
            head2.next = ptr1;
            temp = ptr1;
            head2 = ptr2;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        temp.next = head2;
        head2.next = ptr1;
    }
}

// Problem: Reorder List
// Problem Link: https://leetcode.com/problems/reorder-list/
// Approach: Find the middle of the linked list using slow and fast pointers, reverse the second half, then merge the two halves alternately to reorder the list.
// Time Complexity: O(n) (find middle + reverse + merge are all linear)
// Space Complexity: O(1) (reordering is done in-place using pointers)
