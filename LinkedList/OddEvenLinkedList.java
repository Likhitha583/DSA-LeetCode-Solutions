class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode ptr = head, h1 = d1, h2 = d2;
        while (ptr != null) {
            d1.next = ptr;
            ptr = ptr.next;
            d1 = d1.next;
            if (ptr != null) {
                d2.next = ptr;
                ptr = ptr.next;
                d2 = d2.next;
            }
        }
        d1.next = h2.next;
        d2.next = null;
        return h1.next;
    }
}

// Problem: Odd Even LinkedList
// Problem Link: https://leetcode.com/problems/odd-even-linked-list/
// Approach: Use two separate linked lists to store nodes at odd and even positions. Traverse the original list, alternately attaching nodes to the odd and even lists, then connect the odd list to the even list.
// Time Complexity: O(n) (each node is visited once)
// Space Complexity: O(1) auxiliary space (only a constant number of pointers/dummy nodes are used).
