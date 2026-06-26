class MinStack {
    class Pair{
        int val;
        int min;
        Pair (){}
        Pair(int val, int min){
            this.val = val;
            this.min = min;
        }
    }
    Stack<Pair> st = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int value) {
        if(st.isEmpty()){
            st.push(new Pair(value,value));
            return;
        }
        Pair pr = new Pair();
        pr.val = value;
        Pair top = st.peek();
        if(value < top.min){
            pr.min = value;
        }
        else{
            pr.min = top.min;
        }
        st.push(pr);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        Pair pr = st.peek();
        return pr.val;
    }
    
    public int getMin() {
        if(st.isEmpty()) return -1;
        Pair pr = st.peek();
        return pr.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */