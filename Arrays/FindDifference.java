class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        for (int n1 : nums1)
            s1.add(n1);
        for (int n2 : nums2)
            s2.add(n2);
        for (int i : s1) {
            if (!s2.contains(i))
                a.add(i);
        }
        ans.add(a);
        a = new ArrayList<>();
        for (int n2 : s2) {
            if (!s1.contains(n2))
                a.add(n2);
        }
        ans.add(a);
        return ans;
    }
}

// Problem: Find the Difference of Two Arrays
// Problem Link: https://leetcode.com/problems/find-the-difference-of-two-arrays/
// Approach: Use two HashSets to store the unique elements of nums1 and nums2. Traverse each set and add elements that are absent in the other set to the corresponding result list.
// Time Complexity: O(n + m) average — where n and m are the lengths of nums1 and nums2.
// Space Complexity: O(n + m) — for the two HashSets and result lists.
