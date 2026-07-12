class Solution {
    public int orangesRotting(int[][] grid) {
        int fo = 0;
        Queue <int[]> q = new ArrayDeque<>();
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]== 1)
                    fo++;
                else if(grid[i][j] == 2){
                    q.add(new int[]{i,j});
                }
            }
        }
        if(fo == 0)
            return 0;
        int mins=0,nr,nc;
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};
        
        while(!q.isEmpty() && fo >0){
            int s = q.size();
            mins++;
            for(int i=0;i<s;i++){
                int curr[] = q.poll();
                int r = curr[0];
                int c = curr[1];
                for(int j=0;j<4;j++){
                    nr = r+dr[j];
                    nc = c+dc[j];
                    if(nr>=0 && nr < grid.length&& nc >=0 && nc < grid[0].length && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                    fo--;
                    q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        if(fo > 0)
        return -1;
        return mins;
    }
}

// Problem: Rotting Oranges
// Problem Link: https://leetcode.com/problems/rotting-oranges/
// Approach: Use multi-source BFS by adding all initially rotten oranges to a queue. Process the queue level by level
// (each level = 1 minute), rotting adjacent fresh oranges and counting the remaining fresh oranges until all are rotten
// or no further spread is possible.
// Time Complexity: O(m × n) (each cell is visited at most once)
// Space Complexity: O(m × n) (queue stores rotten oranges in the worst case)
