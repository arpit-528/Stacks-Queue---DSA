class MyQueue {
    Stack<Integer> st1, st2;
    int size;
    public MyQueue() {
        this.st1 = new Stack<>();
        this.st2 = new Stack<>();
        this.size = 0;
    }
    
    public void push(int x) {
        st1.push(x); 
        size += 1;
    }
    
    public int pop() {
        if (empty()) {
            return -1;
        }
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        size -= 1; 
        return st2.pop();
    }
    
    public int peek() {
        if (empty()) {
            return -1;
        }
        if (st2.isEmpty()) {
            while (!st1.isEmpty()) {
                st2.push(st1.pop());
            }
        }
        return st2.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}
