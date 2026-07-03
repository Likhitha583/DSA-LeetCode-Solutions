class MyCircularDeque {
    int f = -1,r=-1,s=0,cap,q[];
    public MyCircularDeque(int k) {
        q = new int[k];
        cap = k;
        r = -1;
        f = -1;
    }
    public boolean insertFront(int value) {
        if(s == cap)
            return false;
        if (s == 0) {  
            f = 0;  
            r = 0;  
            q[0] = value;  
            s++;
            return true;
        }
        f = (f+cap-1)%cap;
        q[f] = value;
        s++;
        return true;
    }
    public boolean insertLast(int value) {
        if(s == cap)
            return false;
        if (s == 0) {  
            f = 0;  
            r = 0;  
            q[0] = value;  
            s++;
            return true;
        }
        r = (r+1)%cap;
        q[r] = value;
        s++;
        return true;
    }
    public boolean deleteFront() {
        if(s == 0)
            return false;
        if (s == 1) {
        f = -1;
        r = -1;
        s = 0;
        return true;
        }
        f=(f+1)%cap;
        s--;
        return true;
    }
    public boolean deleteLast() {
        if(s == 0)
            return false;
        if (s == 1) {
        f = -1;
        r = -1;
        s = 0;
        return true;
        }
        r = (r+cap-1)%cap;
        s--;
        return true;
    }
    public int getFront() {
        if(s == 0)
            return -1;
        return q[f];
    }
    public int getRear() {
        if(s==0)
            return -1;
        return q[r];
    }
    public boolean isEmpty() {
        return s==0;
    }
    public boolean isFull() {
        return s==cap;
    }
}

// Problem: Design Circular Deque
// Problem Link: https://leetcode.com/problems/design-circular-deque/
// Approach: Implement a circular deque using a fixed-size array with front, rear, and size variables.
// Update front and rear using modulo arithmetic to efficiently support insertion and deletion at both ends.
// Time Complexity: insertFront, insertLast, deleteFront, deleteLast, getFront, getRear, isEmpty, isFull → O(1)
// Space Complexity: O(k), where k is the deque capacity.
