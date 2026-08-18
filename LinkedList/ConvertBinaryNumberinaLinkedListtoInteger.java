class Solution {
    public int getDecimalValue(ListNode head) {
        int len = -1;
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int result = 0;
        while (head != null) {
            result += (head.val) * Math.pow(2, len--);
            head = head.next;
        }
        return result;
    }
}

// Problem: Convert Binary Number in a Linked List to Integer
// Problem Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
// Approach: First find the length of the binary linked list, then traverse it again and convert each bit to its decimal value using its corresponding power of 2.
// Time Complexity: O(n) (two traversals of the linked list)
// Space Complexity: O(1).
