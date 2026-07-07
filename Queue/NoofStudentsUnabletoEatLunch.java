class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0;i<students.length;i++){
            q.offer(students[i]);
        }
        int cnt = 0,i=0;
        while(!q.isEmpty()){
            if(q.peek() == sandwiches [i]){
                q.poll();
                i++;
                cnt = 0;
            }
            else{
                q.offer(q.poll());
                cnt++;}
            if(cnt == q.size())
                return q.size();
        }
        return 0;
    }
}

// Problem: Number of Students Unable to Eat Lunch
// Problem Link: https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
// Approach: Store all students in a queue and simulate the process. If the front student's preference matches the 
// current sandwich, they take it; otherwise, move them to the back. Stop when a full rotation occurs without anyone
// taking the sandwich.
// Time Complexity: O(n²) in the worst case (students may be rotated many times)
// Space Complexity: O(n) (queue stores all students)
