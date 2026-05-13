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