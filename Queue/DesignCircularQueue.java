class MyCircularQueue {
    int f = 0, cap, r = 0, s = 0;
    int q[];

    public MyCircularQueue(int k) {
        q = new int[k];
        cap = k;
    }

    public boolean enQueue(int value) {
        if (s == cap)
            return false;
        else {
            q[r] = value;
            r = (r + 1) % cap;
            s++;
            return true;
        }
    }

    public boolean deQueue() {
        if (s == 0)
            return false;
        else {
            f = (f + 1) % cap;
            s--;
            return true;
        }
    }

    public int Front() {
        if (s == 0)
            return -1;
        return q[f];
    }

    public int Rear() {
        if (s == 0)
            return -1;
        return q[(r - 1 + cap) % cap];
    }

    public boolean isEmpty() {
        return (s == 0);
    }

    public boolean isFull() {
        return (s == cap);
    }
}

// Problem: Design Circular Queue
// Problem Link: https://leetcode.com/problems/design-circular-queue/
// Approach: Implement a circular queue using a fixed-size array with front, rear, and size pointers.
// Update indices using modulo arithmetic to wrap around, enabling efficient enqueue and dequeue operations.
// Time Complexity: enQueue, deQueue, Front, Rear, isEmpty, isFull → O(1)
// Space Complexity: O(k), where k is the queue capacity.
