class StockSpanner {
    Stack<int []> stk = new Stack<>();
    int cnt = 1;
    public StockSpanner() {} 
    public int next(int price) {
        if((!stk.isEmpty() && stk.peek()[1] > price)){ 
            stk.push(new int[]{1,price});
            return 1;
        }
        else{
            cnt = 1;
            int arr[];
            while(!stk.isEmpty() && stk.peek()[1] <= price){
                arr = stk.pop();
                cnt+= arr[0];  
            }
            stk.push(new int[]{cnt,price});
            return cnt;
        }
    }
}

// Problem: Online Stock Span
// Problem Link: https://leetcode.com/problems/online-stock-span/
// Approach: Maintain a monotonic decreasing stack where each element stores {span, price}. For every new price, 
// pop all smaller or equal prices while accumulating their spans, then push the current price with its total span.
// Time Complexity: O(n) amortized (each element is pushed and popped at most once)
// Space Complexity: O(n) (stack storing at most n elements)
