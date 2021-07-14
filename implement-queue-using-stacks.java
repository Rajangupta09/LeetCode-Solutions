class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    int size = 0;
    /** Initialize your data structure here. */
    public MyQueue() {
        st1 = new Stack<Integer>();
        st2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        size++;
        if(st1.empty()==true){
            st1.push(x);
        }
        else{            
            while(st1.empty()==false){
              
                st2.push(st1.peek());
                st1.pop();
            }
            st2.add(x);
            while(st2.empty()==false){
                st1.push(st2.peek());
                st2.pop();
            }            
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        size--;
        int val = st1.peek();
        st1.pop();
        return val;
    }
    
    /** Get the front element. */
    public int peek() {
        
        return st1.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(size ==0)return true;
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */