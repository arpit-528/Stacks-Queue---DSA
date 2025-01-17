public class LL_implementation {
public static class Node{
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public static class Stack {
    Node head = null;
    int size = 0;
    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
        System.out.println("Pushed Element: "+ x);
       
    }

    void peek() {
        if(head == null) {
            System.out.println("Stack is Empty!");
        } 
        System.out.println("Peek Element: " +head.val);
    }
    void pop() {
        if(head == null) {
            System.out.println("Stack is Empty!");
        } 
        int x = head.val;
        head = head.next;
        System.out.println("Popped Element is: " + x);
        size--;
    }

    void size() {
        System.out.println("The size of the Stack is : " +size);
    }
}
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(3);
        st.peek();
        st.size();
        st.pop();
        st.peek();
        st.push(4);
        st.size();
        st.push(10);
        st.peek();
        st.push(6);
        st.push(8);
        st.peek();
        st.pop();
        st.pop();
        st.size();
        st.pop();
        st.pop();
        st.pop();
        st.push(4);
        st.push(4);
        st.push(4);
        st.push(4);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.size();
       
    }
}
