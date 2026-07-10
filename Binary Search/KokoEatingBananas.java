class Solution {
    static boolean isValid(int[] p,int n,int mid,int h){
        int cnt = 0;
        for(int i=0;i<n;i++){
           cnt += Math.ceil((double)p[i]/mid);
        }
        return cnt<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        max = Math.max(piles[i],max);
        int low = 1,high = max,mid,res=0;
        while(low <= high){
            mid = low+ (high-low)/2;
            if(isValid(piles,n,mid,h)){
                res = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}

// Problem: Koko Eating Bananas
// Problem Link: https://leetcode.com/problems/koko-eating-bananas/
// Approach: Apply binary search on the eating speed from 1 to the maximum pile size. For each candidate speed, calculate
// the total hours needed to eat all bananas; if it is within h, try a smaller speed, otherwise increase the speed.
// Time Complexity: O(n log M), where n is the number of piles and M is the maximum pile size.
// Space Complexity: O(1).
