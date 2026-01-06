class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
    }
}
class deleteNode{
public void delete(Node node){
    if(node != null && node.next != null){
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

public void print(Node head){
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.val + " ");
        temp = temp.next;
    }
    System.out.println();
}
}

public class deleteNodeInLL{
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        deleteNode d1 = new deleteNode();

        System.out.println("The given LinkedList is:");
        d1.print(head);

        d1.delete(head.next.next);
        System.out.println("LinkedList after deleting:");
        d1.print(head);
    }
}