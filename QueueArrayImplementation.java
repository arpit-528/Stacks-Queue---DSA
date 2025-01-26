public class ArrayImplementation {
 public static class queue {
    int f = -1;
    int r = -1;
    int size = 0;
     int arr[] = new int[100];
    public void add(int val) {
        if(size == arr.length-1) {
            System.out.println("Queue is full!");
            return;
        } 
        if(r==-1) {
            f = 0;
            r = 0;
            arr[0] = val;
            size++;
            return;
        } 
        r++;
        arr[r] = val;
    size++;
}
    public int remove() {
        if(size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int x = arr[f];
        f++;
        size--;
        return x;
 }   
    public int peek() {
        if(size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        return arr[f];
    }
    public void display() {
        if(size == 0) {
            System.out.println("Queue is Empty!");
            return;
    }
        for(int i = f; i<=r; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
 }
}
    public static void main(String[] args) {
        queue q = new queue();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        System.out.println(q.peek());
        q.display();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.peek());
        q.add(10);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.remove();
        q.display();
    }
   
}
