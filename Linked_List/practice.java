class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}

class SLL{
    Node head;
    Node tail;
    int size;
    
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertATEnd(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insert(int idx,int val) throws Error{
        if(idx==0){
            insertAtHead(val);
        }
        if(idx==size-1){
            insertATEnd(val);
        }
        if(idx>size || idx<0){
            throw new Error("Invalid index");
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=0;i<=idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
       x.next = temp;
        size++;
    }

    int get(int idx) throws Error{
        if(idx == 0){
            return head.val;
        }
        if(idx == size-1){
            return tail.val;
        }
        if(idx>=size || idx<0){
            throw new Error("Invalid index");
        }
        Node temp = head;
        for(int i=0;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }

    void set(int idx,int val)throws Error{
        if(idx==size-1){
         tail.val = val;
        }
        if(idx>=size || idx<0 ){
            throw new Error("Invalid Index");
        }
        Node temp = head;
        for(int i=0;i<=idx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("Size is: " + size);
    }

}
public class practice {
    public static void main(String[] args){
        // Node a = new Node(2);
        // Node b = new Node(3);
        // Node c = new Node(4);
        // Node d = new Node(5);
        // Node e = new Node(6);

        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;

        // System.out.print(a.val + " ");
        // System.out.print(b.val + " ");
        // System.out.print(c.val + " ");
        // System.out.print(d.val + " ");
        // System.out.print(e.val + " ");

        // System.out.print(b.next + " ");

        // System.out.println(a.next.next.val);

        SLL list = new SLL();
        list.insertAtHead(22);
        list.insertAtHead(44);
        list.insertAtHead(60);
        list.display();
        list.size();
        list.insertATEnd(55);
        list.display();
        list.size();
        list.insert(2,11);
        list.display();
        list.size();
    }
}