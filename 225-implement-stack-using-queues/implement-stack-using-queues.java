class MyStack {
    //using single queue
    Queue<Integer> q1;
    public MyStack() {
        q1 = new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
        int n = q1.size()-1;
        for(int i=1; i<=n ; i++){
            int val = q1.poll();
            q1.offer(val);
        }

    }
    
    public int pop() {
        return q1.poll();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
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