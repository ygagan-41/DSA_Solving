class MyQueue {
    Deque<Integer> st1;
    Deque<Integer> st2;

    public MyQueue() {
        st1 = new ArrayDeque<>();
        st2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        //shift all elements from st1 to st2
        while(!st1.isEmpty()){
            int topElement = st1.peek();
            st1.pop();
            st2.push(topElement);
        }
        //insert x into st1
        st1.push(x);

        //shift all elements from st2 to st1
        while(!st2.isEmpty()){
            int topElement = st2.peek();
            st2.pop();
            st1.push(topElement);
        }
    }
    
    public int pop() {
        return st1.pop();
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
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