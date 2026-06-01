class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());

    }
}

// Problem: Group Anagrams 
// Problem Link: https://leetcode.com/problems/group-anagrams/
// Approach: Sort each string and use the sorted string as a key in a HashMap to group anagrams together.
// Time Complexity: O(N*K*logK)
// Space Complexity: O(N*K)
