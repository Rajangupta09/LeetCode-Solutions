class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size = 0;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 =  new LinkedList<Integer>();
        q2 =  new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        size++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q1.isEmpty() == true)return -1;
        while(q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
        }
        int val = q1.peek();
        q1.remove();
        size--;
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return val;
    }
     
    /** Get the top element. */
    public int top() {
        if(q1.isEmpty() == true)return -1;
        while(q1.size()!=1){
            q2.add(q1.peek());
            q1.remove();
        }
        int val = q1.peek();
        q2.add(val);
        q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        
        return val;
        
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(size==0)return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */