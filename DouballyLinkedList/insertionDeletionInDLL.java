class DLL{
    dNode head;
    dNode tail;
    int size;

    void display(){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();  
    }

    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp; //extra
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
            insertAtTail(val);
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid index");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp;
        temp.prev = x;
        y.prev = temp;
        temp.next = y;
        size++;
    }

    void deleteAtHeaad(){
        if(size==0){
            System.out.println("List is enpty");
        }
        head = head.next;
        head.prev = null;
        size--;
    }

    void deleteAtTail(){
        if(size==0){
            System.out.println("List is enpty");
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    void deleteAtIndex(int idx){
        if(idx==0){
            deleteAtHeaad();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid index");
            return;
        }
        dNode x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        x.next = x.next.next;
        x = x.next;
        x.prev = x.prev.prev;
        size--;
    }

    int get(int idx){
        if(idx == 0){
            return head.val;
        }
        if(idx == size-1){
            return tail.val;
        }
        dNode temp = head;
        for(int i=0;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }

     void set(int idx,int val){
        if(idx==0){
            head.val = val;
            return;
        }
        if(idx==size){
            tail.val = val;
            return;
        }
        if(idx>size || idx<0){
            System.out.println("Invalid index");
            return;
        }
        dNode x = head;
        for(int i=1;i<=idx;i++){
            x = x.next;
        }
        x.val = val;
    }
    
}
public class insertionDeletionInDLL{
    public static void main(String[] args){
       DLL list = new DLL();
       list.display();
       list.insertAtTail(10);
       list.insertAtTail(20);
       list.insertAtHead(40);
       list.insertAtHead(60);
       list.insertAtHead(55);
       list.display();
       list.insert(2,23);
       list.display();
       list.deleteAtIndex(3);
       list.display();
       System.out.println(list.get(1));
       list.set(0,11);
       list.display();


    }
}