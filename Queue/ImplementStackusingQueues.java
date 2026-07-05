class MyStack {
int stk[];
    int top =-1;
    public MyStack() {
        stk = new int[1000];
    }
    
    public void push(int x) {
        stk[++top]=x;
    }
    
    public int pop() {
        if(top==-1)
        return -1;
       return stk[top--];
    }
    
    public int top() {
        if(top==-1)
        return -1;
       return stk[top];
    }
    
    public boolean empty() {
        if(top==-1)
        return true;
        return false;
    }
}

// Problem: Implement Stack using Queues
// Problem Link: https://leetcode.com/problems/implement-stack-using-queues/
// Approach: Implement a stack using a fixed-size array and a top pointer. Increment top for push, decrement it for pop, 
// and use it to access the current top element.
// Time Complexity: push, pop, top, empty → O(1)
// Space Complexity: O(n) (array stores up to n elements; in this implementation, the maximum capacity is 1000).
