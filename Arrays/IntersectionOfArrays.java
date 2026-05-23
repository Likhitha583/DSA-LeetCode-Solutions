class Solution {
    public int[] intersection(int[] nums1, int[] nums2){
        Set <Integer> n = new HashSet<>();
        Set <Integer> res = new HashSet<>();
        for(int i:nums1)
            n.add(i);
        for(int i:nums2)
            if (n.contains(i))
                res.add(i);
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

// Problem: Intersection of Two Arrays
// Problem Link: https://leetcode.com/problems/intersection-of-two-arrays/description/
// Approach: Using HashSet to store elements of the first array and then checking for common elements in the second array.
// Time Complexity: O(n + m) where n and m are the lengths of the two input arrays, as we traverse both arrays once.
// Space Complexity: O(n) where n is the length of the first input array, as we store its elements in a HashSet. The space used for the result set is at most O(min(n, m)) where m is the length of the second input array.