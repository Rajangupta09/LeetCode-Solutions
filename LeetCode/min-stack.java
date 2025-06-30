class MinStack {
    ArrayList<Integer> st;
    int top = -1;
    /** initialize your data structure here. */
    public MinStack() {
        st = new ArrayList<Integer>();
    }
    
    public void push(int val) {
        st.add(val);
        top++;
        return;
    }
    
    public void pop() {
        st.remove(top);
        top--;
        return;
    }
    
    public int top() {
        return st.get(top);
    }
    
    public int getMin() {
        int min = st.get(0);
        for(int i=1;i<=top;i++)
            min = Math.min(min,st.get(i));
        return min;
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