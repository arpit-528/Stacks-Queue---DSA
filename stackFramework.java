import java.util.Stack;
public class stackFramework {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.push(50);
        System.out.println(st.pop());
        System.out.println(st);
        while(st.size() > 2) {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}


