class MinStack {
    Stack<Integer> min = new Stack<>();
    Stack<Integer> minstk = new Stack<>();
public MinStack() {
}

public void push(int val) {        
    min.push(val);
if(minstk.isEmpty()||minstk.peek()>=val)
    minstk.push(val);
}

public void pop() {        
    int val = min.peek();        
    min.pop();        
    if(!minstk.isEmpty() && minstk.peek() ==val)        
        minstk.pop();        
}        
        
public int top() {   
    return min.peek();        
}        
        
public int getMin() {
    return minstk.peek();
}
}

// Problem: Min Stack
// Problem Link: https://leetcode.com/problems/min-stack/
// Approach: Use two stacks: one (min) stores all elements, and another (minstk) stores the minimum elements. While pushing, add to minstk
// if the new value is less than or equal to the current minimum; while popping, remove from minstk only if the popped value is the current minimum.
// Time Complexity: push(), pop(), top(), and getMin() all take O(1) time.
// Space Complexity: O(n), as the auxiliary minimum stack may store up to n elements (e.g., when elements are pushed in decreasing order).
