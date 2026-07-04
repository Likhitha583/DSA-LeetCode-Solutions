class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new ArrayDeque<>();
        Queue<Integer> dir = new ArrayDeque<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R')
                rad.offer(i);
            else
                dir.offer(i);
        }
        while (!rad.isEmpty() && !dir.isEmpty()) {
            if (rad.peek() < dir.peek())
                rad.offer(n);
            else
                dir.offer(n);
            rad.poll();
            dir.poll();
            n += 1;
        }
        if (dir.isEmpty())
            return "Radiant";
        else
            return "Dire";
    }
}

// Problem: Dota2 Senate
// Problem Link: https://leetcode.com/problems/dota2-senate/
// Approach: Store the indices of Radiant and Dire senators in separate queues. Repeatedly compare the front indices;
// the senator with the smaller index bans the other and is reinserted with index currentIndex + n to represent the next round.
// Time Complexity: O(n) (each senator is processed and requeued at most once per survival until one party is eliminated)
// Space Complexity: O(n) (two queues store all senator indices)
