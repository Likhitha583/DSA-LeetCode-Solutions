class MyHashSet {
    ArrayList<Integer> set = new ArrayList<>();
    public MyHashSet() {}
    public void add(int key) {
        if (!contains(key))
            set.add(key);
    }
    public void remove(int key) {
        set.remove(Integer.valueOf(key));
    }
    public boolean contains(int key) {
        for (int s : set) {
            if (s == key)
                return true;
        }
        return false;
    }
}

// Problem: Design Hashset
// Problem Link: https://leetcode.com/problems/design-hashset/
// Approach: Use an ArrayList to store unique keys. add() checks for existence before insertion, remove() deletes the matching value, and contains() performs a linear search.
// Time Complexity: add / remove / contains → O(n)
// Space Complexity: O(n) for storing the keys.
