class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }
}
public class DisplayLinkedList{     // simple way to print all the nodes
    // public static void print(Node Head){
    //    Node temp = Head;
    //    while(temp!=null){
    //     System.out.println(temp.val);
    //     temp = temp.next;
    //    }
    // }
    public static void PrintRecursively(Node Head){   //we are printing all nodes with the heple of recursion
        if(Head==null) return;
        System.out.println(Head.val);
        PrintRecursively(Head.next);

    }
    public static void main(String[] args){
        //assigining the value of each node
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        

        //giving the address of 'b' at the next part of 'a'
        a.next = b; //10->20
        b.next = c; //10->20->30
        c.next = d;
        d.next = e;

        // print(a);
        PrintRecursively(a);

    }
}