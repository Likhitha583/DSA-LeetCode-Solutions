public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode list = head,fast = head;
        while(fast != null && fast.next != null){
            head = head.next;
            fast = fast.next.next;
            if(head == fast){
                while(list != fast){
                    list = list.next;
                    fast = fast.next;
                }
                return list;
            }
        }
        return null;
    }
}

// Problem: Linked List Cycle II
// Problem Link: https://leetcode.com/problems/linked-list-cycle-ii/
// Approach: Use Floyd’s Cycle Detection (slow and fast pointers). Move head one step and fast two steps; when they meet, move another pointer from the original head along with fast until they meet again at the cycle’s starting node.
// Time Complexity: O(n)
// Space Complexity: O(1)
