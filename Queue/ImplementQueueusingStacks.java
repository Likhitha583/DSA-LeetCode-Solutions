class MyQueue {
    Stack<Integer> stk1 = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        stk1.push(x);
    }

    public int pop() {
        if (stk2.isEmpty()) {
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
        }
        return stk2.pop();
    }

    public int peek() {
        if (stk2.isEmpty()) {
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }
        }
        return stk2.peek();
    }

    public boolean empty() {
        return stk2.isEmpty() & stk1.isEmpty();
    }
}

// Problem: Implement Queue using Stacks
// Problem Link: https://leetcode.com/problems/implement-queue-using-stacks/
// Approach: Implement a queue using two stacks. Push elements into the input stack,
// and when pop() or peek() is called, transfer elements to the output stack only if it is empty, preserving FIFO order.
// Time Complexity: push – O(1), pop/peek – O(1) amortized, empty – O(1)
// Space Complexity: O(n) (two stacks store all queue elements)
