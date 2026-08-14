public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        while (ptr1 != ptr2) {
            if(ptr1 != null) 
                ptr1 = ptr1.next;
            else 
                ptr1 = headB;
            if(ptr2 != null)
                ptr2 = ptr2.next;
            else
                ptr2 = headA;
        }
        return ptr1;
    }
}

// Problem: Intersection of Two Linked Lists
// Problem Link: https://leetcode.com/problems/intersection-of-two-linked-lists/
// Approach: Use the two-pointer switching technique. Move both pointers through their lists; when one reaches the end, redirect it to the head of the other list. This makes both pointers travel the same total distance, so they meet at the intersection node (or null).
// Time Complexity: O(n + m)
// Space Complexity: O(1)
