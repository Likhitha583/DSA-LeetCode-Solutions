class Solution {
    public String simplifyPath(String path) {
        Deque<String> q = new ArrayDeque<>();
        String[] p = path.split("/");
        for(String s: p){
            if(!s.equals("") && !s.equals(".")){
                if(!s.equals(".."))
                q.add(s);
                else if(!q.isEmpty())
                q.pollLast();
            }
        }
        if(q.isEmpty())
        return "/";
        StringBuffer sb = new StringBuffer();
        for(String st: q){
            sb.append("/");
            sb.append(st);
        }
        return sb.toString();
    }
}

// Problem: Simplify Path
// Problem Link: https://leetcode.com/problems/simplify-path/
// Approach: Use a Deque (Stack) to simplify the Unix path. Split the path by / and process each part: ignore empty strings and ".", add normal directory names to the deque, and for "..", remove the last directory if one exists. Finally, construct the simplified path by joining the remaining directories with /.
// Time Complexity: O(n) — where n is the length of the path.
// Space Complexity: O(n) — for the split array and deque.
