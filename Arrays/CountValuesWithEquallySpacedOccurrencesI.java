class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        for (ArrayList<Integer> a : map.values()) {
            if (a.size() == 3) {
                if ((a.get(1) - a.get(0)) == (a.get(2) - a.get(1)))
                    cnt++;
            }
        }
        return cnt;
    }
}

// Problem: Count Values With Equally Spaced Occurrences I
// Problem Link: https://leetcode.com/problems/count-values-with-equally-spaced-occurrences-i/
// Approach: Use a HashMap to store each number and the list of indices where it occurs. For every number that appears exactly 3 times, check whether the three indices form an arithmetic progression by comparing the two consecutive gaps. If the gaps are equal, increment cnt.
// Time Complexity: O(n) — storing indices and checking each occurrence list.
// Space Complexity: O(n) — for the HashMap and stored indices.
