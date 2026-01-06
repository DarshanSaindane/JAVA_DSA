class Node{
    int val;
    Node next; 
    Node(int val){
        this.val=val;
    }
} 
class SLL{
    Node head;
    Node tail;
    int size;  //default value of size in java is zero
    void insertATEnd(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtHead(int val){
         Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
        }
        else{
           temp.next = head;
            head = temp;
        }
        size++;
    }
   void insert(int idx,int val){
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertATEnd(val);
            return;
        }
        if(idx>size){
            System.out.println("Invalid index!!");
            return;
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
    if(idx==size-1){
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
   void set (int idx,int val) throws Error{
    if(idx==size-1){
        tail.val = val;
    }
    if(idx>=size || idx<0){
        throw new Error("Invalid index");
    }
    Node temp = head;
    for(int i=0;i<=idx;i++){
        temp = temp.next;
    }
     temp.val = val;
   }
   void deleteAtHead(){
    head = head.next;
    size--;
   }
   void delete(int idx) throws Error{
    if(idx==0){
        deleteAtHead();
        return;
    }
    if(head==null){
        throw new Error("List is Empty!!");
    }
    if(idx<0 || idx>=size){
        throw new Error("Invalid index!!");
    }
    Node temp = head;
    for(int i=1;i<=idx-1;i++){
        temp = temp.next;
    }
    if(temp.next == tail){
        tail = temp;
    }
    temp.next = temp.next.next;
    size--;
   }
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void size(){
        System.out.println("size is: "+size);
    }

}
public class Implementation{
    public static void main(String[] args){
        SLL list = new SLL();
        list.insertATEnd(10);
        list.insertATEnd(20);
        list.insertATEnd(30);
        list.insertATEnd(40);
        list.insertATEnd(50);

        list.display();
        list.insertATEnd(23);
        list.display();
        list.size();
        list.insertAtHead(33);
        list.display();
        list.insert(3,55);
        list.display();
        System.out.println(list.get(2));
        list.set(3,69);
        list.display();
        list.delete(3);
        list.display();
        list.size();
        list.set(5,77);
        list.display();
        
    }
}