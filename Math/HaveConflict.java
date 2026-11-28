class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        return event1[0].compareTo(event2[1]) <= 0 && event1[1].compareTo(event2[0]) >= 0;
    }
}

// Problem: Determine if Two Events Have Conflict
// Problem Link: https://leetcode.com/problems/determine-if-two-events-have-conflict/
// Approach: Use lexicographical string comparison to check whether the two time intervals overlap. They overlap if the first event starts before or when the second event ends, and the first event ends after or when the second event starts.
// Time Complexity: O(1) — fixed-length time strings.
// Space Complexity: O(1)
