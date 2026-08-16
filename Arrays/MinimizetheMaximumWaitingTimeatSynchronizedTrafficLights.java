class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        boolean flag = true;
        int penalty = 0, max = 0;
        for (int i = 0; i < lights.length; i++) {
            max = Math.max(lights[i], max);
        }
        for (int i = 0; i < arrivalTime.length; i++) {
            flag = true;
            int r = arrivalTime[i] % period;
            if (r >= max)
                flag = false;
            if (!flag) {
                if (penalty < (period - r))
                    penalty = (period - r);
            }
        }
        return penalty;
    }
}

// Problem: Minimize the Maximum Waiting Time at Synchronized Traffic Lights
// Problem Link: https://leetcode.com/contest/weekly-contest-515/problems/minimize-the-maximum-waiting-time-at-synchronized-traffic-lights/
// Approach: Find the maximum red-light duration and check each arrival time using arrivalTime[i] % period. If the remainder falls within the red-light interval, calculate the waiting time and keep the maximum penalty.
// Time Complexity: O(n + m), where n = lights.length and m = arrivalTime.length
// Space Complexity: O(1)
