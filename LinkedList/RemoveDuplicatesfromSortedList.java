class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)return null;
        ListNode temp = head;
        while(temp.next != null){
            if(temp.val == temp.next.val)
                temp.next = temp.next.next;
            else 
                temp = temp.next;
        }
        return head;
    }
}

// Problem: Remove Duplicates from Sorted List
// Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// Approach: Traverse the sorted linked list once. If the current node and the next node have the same value, skip the duplicate by updating the next pointer; otherwise, move to the next node.
// Time Complexity: O(n) (each node is visited at most once)
// Space Complexity: O(1) (no extra space is used)
