class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class linkedListImplementation{
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val){
            Node temp = new Node(val);
            if(size == 0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if(size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            else{
                return head.val;
            }
        }

        public int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return 0;
            }
            else{
                int val = head.val;
                head = head.next;
                size--;
                return val;
            }
        }

        public boolean isEmpty(){
            if(size == 0){
                return true;
            }
            else{
                return false;
            }
        }

        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val + ",");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        queueLL que = new queueLL();
        que.add(1);
        que.add(2);
        que.add(3);
        que.display();
        que.remove();
        que.display();

    }
}