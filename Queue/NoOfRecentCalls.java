class RecentCounter {
    ArrayDeque<Integer> q = new ArrayDeque<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        q.offer(t);
        while (q.peek() < t - 3000)
            q.poll(); 
        return q.size();
    }
}

// Problem: Number of Recent Calls
// Problem Link: https://leetcode.com/problems/number-of-recent-calls/
// Approach: Use a queue to store the timestamps of recent requests. For each ping(t), 
// add t, remove all timestamps older than t - 3000, and return the queue size.
// Time Complexity: O(1) amortized per ping() (each timestamp is enqueued and dequeued at most once)
// Space Complexity: O(n) (queue stores timestamps within the last 3000 ms)
