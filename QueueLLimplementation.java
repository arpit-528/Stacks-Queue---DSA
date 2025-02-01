public class LinkedlistImplementation {
        public static class node {
            int val; 
            node next;
    
            node(int val) {
                this.val = val;
            }
        }
            public static class queuell {
                node head = null;
                node tail = null;
                int size = 0;
    
                public void add(int x) {
                    node temp = new node(x);
                    if(size == 0) {
                        head = tail = temp;
                    } else {
                    tail.next = temp;
                    tail = temp;
                    }
                    size++;
                }
                public void peek(){
                    if(size==0) {
                        System.out.println("Queue is empty!");
                    } else {
                        System.out.println(head.val);
                    }
    
                }
                public int remove() {
                    if(size == 0) {
                        System.out.println("Queue is empty!");
                        return -1;
                    }
                    int x = head.val;
                    head = head.next;
                    size--;
                    return x;
                }
                public void display() {
                  node temp = head;
                    if(size == 0) {
                        System.out.println("Queue is empty!");
                    } else {
                        while(temp != null) {
                            System.out.print(temp.val + " ");
                           temp = temp.next ;
                        }
                        System.out.println();
                    }
                }
                public boolean isEmpty() {
                    if(size == 0) return true;
                    else return false;
                }
            }
        
    
            public static void main(String[] args) {
             queuell q = new queuell();
             q.add(40);
             q.display();
             q.isEmpty();
             q.remove();
             q.add(20);
             q.add(45);
             q.add(12);
             q.display();
             q.add(43);
             q.peek();
             q.add(90);
             q.remove();
             q.display();
            }
    }
    

