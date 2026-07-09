class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length,idx = 0;
        Deque<Integer> dq = new LinkedList<>();
        int res[] = new int[n-k+1];
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && dq.peekFirst()<=i-k)
                dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()]<= nums[i])
                dq.pollLast();
            dq.offerLast(i);
            if(i>=k-1){
                res[idx++] = nums[dq.peekFirst()];
            }
        }
        return res;
    }
}

// Problem: Sliding Window Maximum 
// Problem Link: https://leetcode.com/problems/sliding-window-maximum/
// Approach: Use a monotonic decreasing deque to store indices of useful elements in the current window.Remove out-of-window
// indices from the front and smaller elements from the back; the front always holds the maximum for the current window.
// Time Complexity: O(n) (each index is added and removed at most once)
// Space Complexity: O(k) (deque stores at most k indices)
