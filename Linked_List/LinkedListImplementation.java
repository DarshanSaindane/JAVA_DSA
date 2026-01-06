package Linked_List;
class node{
    int val;
    node next; 
    node(int val){
        this.val=val;
    }
}
public class LinkedListImplementation{
    public static void main(String[] args){
        //assigining the value of each node
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);

        //giving the address of 'b' at the next part of 'a'
        a.next = b; //10->20
        b.next = c; //10->20->30

        //display the valus in the node
        System.out.println(a.val); 
        System.out.println(b.val);
        System.out.println(c.val);

        //display the next part of the node 'b'
        System.out.println(b.next);
        System.out.println(c.next);  //next part of the 'c' is always null. it indicates that 
                                     //it is the end of the LinkList.
        

        //displaying all nodes with the help of 'Head' node (here 'a' is head node)
        System.out.println(a.val);           
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);                  
    }
}