class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:arr)
            map.put(i,map.getOrDefault(i,0)+1);
        HashSet<Integer> set = new HashSet<>(map.values());
        return (set.size()== map.size());
    }
}

// Problem: Unique Number of Occurrences
// Problem Link: https://leetcode.com/problems/unique-number-of-occurrences/
// Approach: Use a HashMap + HashSet. First, count the frequency of each number using the HashMap. Then insert all frequencies into a HashSet. If the HashSet size equals the number of distinct elements in the HashMap, all occurrence counts are unique.
// Time Complexity: O(n) average — counting frequencies and creating the set.
// Space Complexity: O(n) — for the HashMap and HashSet.
