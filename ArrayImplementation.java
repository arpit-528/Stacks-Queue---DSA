public class ArrayImplementation{
    public static class Stack {
        int[] stack = new int[10];
        int idx = 0;
        void push(int x) {
            if(isFull()) {
                System.out.println("stack is full!");
                return ;
            } else {
           stack[idx] = x;
           idx++;
            }
        }
        void peek() {
            if(isEmpty()) {
                System.out.println("stack is empty!");
            } else {
            System.out.println(stack[idx-1]);
            }
        }
        void pop() {
            if(isEmpty()) {
                System.out.println("stack is empty!");
                return;
            }
            idx--;
           System.out.println(stack[idx]);
           stack[idx] = 0;
        }
        void display() {
            for(int i = 0; i<idx; i++) {
            System.out.print(stack[i] + " ");
            }
        }
        boolean isEmpty() {
            if(idx==0) {
                return true;
            } else {
                return false;
            }
        }
        boolean isFull() {
            if(idx == stack.length) {
                return true;
            } else {
                return false;
            }
        }
        int size() {
            return idx; 
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.peek();
        st.push(3);
        st.peek();
        st.pop();
        st.peek();
        st.push(4);
        st.peek();
        st.push(10);
        st.peek();
        st.push(6);
        st.peek();
        st.push(8);
        st.peek();
        st.display();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        
        st.push(4);
        st.push(4);
        st.push(4);
        st.push(4);
       
    }
}