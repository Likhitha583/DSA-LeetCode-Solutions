class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length,m = matrix[0].length;
        int low = 0,high = (n*m)-1,mid,rn,cn;
        while(low <= high){
            mid = low + (high-low)/2;
            rn = mid/m;
            cn = mid%m;
            if(matrix[rn][cn] == target){
                return true;
            }
            else if(matrix[rn][cn] > target)
                high = mid-1;
            else 
                low = mid + 1;
        }
        return false;
    }
}

// Problem: Search A 2D Matrix
// Problem Link: https://leetcode.com/problems/search-a-2d-matrix/
// Approach: Treat the 2D matrix as a sorted 1D array and perform binary search. Convert the middle index back to row 
// and column using row = mid / m and col = mid % m to access the corresponding element.
// Time Complexity: O(log(m × n))
// Space Complexity: O(1)
