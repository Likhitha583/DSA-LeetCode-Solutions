class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new ArrayDeque<>();
        int time = 0;
        int temp = tickets[k];
        for (int i = 0; i < tickets.length; i++) {
            q.offer(new int[] { i, tickets[i] });
        }
        while (true) {
            int[] arr = q.poll();
            time += 1;
            if (arr[0] == k && arr[1] == 1)
                return time;
            if (arr[1] > 1)
                q.offer(new int[] { arr[0], arr[1] - 1 });
        }
    }
}

// Problem: Time Needed to Buy Tickets
// Problem Link: https://leetcode.com/problems/time-needed-to-buy-tickets/
// Approach: Simulate the ticket-buying process using a queue of {Index, remainingTickets}.In each step,the front person
// buys one ticket; if they still need tickets, reinsert them at the back. Stop when person k buys their last ticket.
// Time Complexity: O(n × t), where t = tickets[k] (equivalently O(∑tickets) in the worst case, 
// since one queue operation is performed per ticket sold).
// Space Complexity: O(n) (queue stores all people).
