class Solution {
    private int toposort(int n,int[][] pre){
        List<List<Integer>> adj = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        int temp,len = pre.length;
        int indegree[] = new int[n];
        for(int i=0;i<n;i++)
        adj.add(new ArrayList<>());
        for(int i=0;i<len;i++){
            adj.get(pre[i][1]).add(pre[i][0]);
        }
        for(int i=0;i<n;i++){
            for(int k:adj.get(i)){
                indegree[k]++;
            }
        }
        for(int i=0;i<n;i++){
            if(indegree[i] == 0)
            q.offer(i);
        }
        while(!q.isEmpty()){
            temp = q.poll();
            ans.add(temp);
            for(int k: adj.get(temp)){
                indegree[k]--;
                if(indegree[k] == 0)
                q.offer(k);
            }
        }
        return ans.size();
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int res = toposort(numCourses,prerequisites);
        if(res == numCourses)
        return true;
        return false;
    }
}

// Problem: Course Schedule 
// Problem Link: https://leetcode.com/problems/course-schedule/
// Approach: Build a graph from the prerequisite pairs and use Kahn’s Algorithm (BFS Topological Sort). Compute indegrees, 
// process all nodes with indegree 0, and if all courses are processed, all courses can be finished; otherwise, a cycle exists.
// Time Complexity: O(V + E), where V is the number of courses and E is the number of prerequisite pairs.
// Space Complexity: O(V + E) (adjacency list, indegree array, queue, and topological order list).
