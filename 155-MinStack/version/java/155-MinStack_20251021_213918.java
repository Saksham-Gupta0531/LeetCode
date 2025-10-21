// Last updated: 10/21/2025, 9:39:18 PM
class MinStack {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    Stack<Integer> st = new Stack<>();
    
    public void push(int val) {
        st.push(val);
        minHeap.add(val);
    }
    
    public void pop() {
        if (!st.isEmpty())

            minHeap.remove(st.pop());
        
    }
    
    public int top() {
        if (!st.isEmpty())
            return st.peek();
        return 0;
    }
    
    public int getMin() {
        return minHeap.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */