class ProductOfNumbers {
    ArrayList<Integer> pre;

    public ProductOfNumbers() {
        pre = new ArrayList<>();
    }

    public void add(int num) {
        int val = 1;
        if (pre.size() > 0)
            val = pre.get(pre.size() - 1);
        if (num > 0)
            pre.add(val * num);
        else
            pre = new ArrayList<>();
    }

    public int getProduct(int k) {
        int n = pre.size(), val1, val2 = 1;
        if (k > n)
            return 0;
        val1 = pre.get(n - 1);
        if (n - k - 1 >= 0)
            val2 = pre.get(n - k - 1);
        return val1 / val2;
    }
}

// Problem: Product of the Last K Numbers
// Problem Link:https: //leetcode.com/problems/product-of-the-last-k-numbers/
// Approach: Maintain prefix products of all numbers since the most recent zero. When 0 is added, reset the prefix list. For getProduct(k), divide the latest prefix product by the prefix product before the last k elements. If k exceeds the current prefix size, return 0.
// Time Complexity: add() – O(1) ; getProduct() – O(1)
// Space Complexity: O(n), where n is the number of elements added since the last zero (worst case O(n) overall).
