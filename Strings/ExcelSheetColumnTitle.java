class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
while(n > 0) {
    n--;
    sb.insert(0, (char)('A' + n%26));
    n /= 26;
}
return sb.toString();
    }
}

//Problem: Excel sheet column title
//Problem Link: https://leetcode.com/problems/excel-sheet-column-title/
//Approach: Bit Manipulation -Converting a decimal number to a base-26 system with an offset 
//adjustment for 1-based indexing.
//Time Complexity: O(N²)
//Space Complexity: O(1)
