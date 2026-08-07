class Solution {
    public ListNode Merge(ListNode ptr1, ListNode ptr2) {
        ListNode temp = new ListNode(0);
        ListNode head = temp;
        while (ptr1 != null && ptr2 != null) {
            if (ptr1.val > ptr2.val) {
                temp.next = ptr2;
                ptr2 = ptr2.next;
            } else {
                temp.next = ptr1;
                ptr1 = ptr1.next;
            }
            temp = temp.next;
        }
        if (ptr1 != null) 
            temp.next = ptr1;
        if (ptr2 != null) 
            temp.next = ptr2;
        return head.next;
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode m = findMid(head);
        ListNode head1 = m.next;
        m.next = null;
        return Merge(sortList(head), sortList(head1));
    }
}

// Problem: Sort List
// Problem Link: https://leetcode.com/problems/sort-list/
// Approach: Use merge sort on the linked list. Find the middle using slow/fast pointers, split the list into two halves, recursively sort both halves, and merge the two sorted lists.
// Time Complexity: O(N log N) - Each level of recursion takes O(N) time to merge, and there are log N levels.
// Space Complexity: O(log N) - The recursion stack will take up to log N space for the depth of the recursive calls.