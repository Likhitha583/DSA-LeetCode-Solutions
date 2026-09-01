class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        ListNode ptr1 = l1, ptr2 = l2, head = new ListNode(0);
        ListNode ptr = head;
        int c = 0, s = 0;
        while (ptr1 != null && ptr2 != null) {
            s = ptr1.val + ptr2.val + c;
            head.next = new ListNode(s % 10);
            c = s / 10;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            head = head.next;
        }
        while (ptr1 != null) {
            s = ptr1.val + c;
            head.next = new ListNode(s % 10);
            c = s / 10;
            ptr1 = ptr1.next;
            head = head.next;
        }
        while (ptr2 != null) {
            s = ptr2.val + c;
            head.next = new ListNode(s % 10);
            c = s / 10;
            ptr2 = ptr2.next;
            head = head.next;
        }
        if (c > 0) {
            head.next = new ListNode(c);
            head = head.next;
        }
        head.next = null;
        return ptr.next;
    }
}

// Problem: Add Two Numbers 
// Problem Link: https://leetcode.com/problems/add-two-numbers/
// Approach: Traverse both linked lists simultaneously, adding corresponding digits along with the carry. After one list ends, process the remaining list, append any final carry, and return the result list using a dummy head.
// Time Complexity: O(max(n, m))
// Space Complexity: O(max(n, m)) for the newly created result linked list.
