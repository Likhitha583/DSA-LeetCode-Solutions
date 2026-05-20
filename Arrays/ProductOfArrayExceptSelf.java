class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[]=new int[nums.length];
        int pro=1,i=0;
        while(i<nums.length){
            a[i] = pro;
            pro*= nums[i];
            i++;}
        i = nums.length-1;pro=1;
        while(i>=0){
            a[i] *= pro;
            pro*= nums[i];
            i--;
        }
        return a;
    }
}

//Problem: Product of array except self
//Problem Link: https://leetcode.com/problems/product-of-array-except-self/
//Approach: Two Pointers - Calculating prefix and suffix products in two passes to solve without division
//Time Complexity: O(N) Traverse entire array in two passes O(N+N) ~ O(N)
//Space Complexity: O(1) No extra space used.
