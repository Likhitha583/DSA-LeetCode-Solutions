class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[] = new int[2];
        Map<Integer,Integer> s = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(target-nums[i])){
                a[0]=s.get(target-nums[i]);
                a[1] = i;
                return a;
        }
        s.put(nums[i],i);
        }
        return a;
    }
}

//Problem: Two Sum
//Problem Link: https://leetcode.com/problems/two-sum/description/
//Approach: HashMap
//Time Complexity: O(n)
//Space Complexity: O(n)
