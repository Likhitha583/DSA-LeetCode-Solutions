class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        int result = 0;
        while (slow != null) {
            result = Math.max(result, slow.val + prev.val);
            slow = slow.next;
            prev = prev.next;
        }
        return result;
    }
}

// Problem: Maximum Twin Sum of a Linked List
// Problem Link: https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
// Approach: Use slow and fast pointers to find the middle of the linked list while reversing the first half simultaneously. Then traverse both halves together and calculate the maximum twin sum.
// Time Complexity: O(n)
// Space Complexity: O(1)
