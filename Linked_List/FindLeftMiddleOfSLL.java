class Node{
    int val;
    Node next;

    public Node(int val){
        this.val = val;
        this.next = next;
    }
}

class Middle{
    Node head;

    Middle(Node head){
        this.head = head;
    }

int find(){
    Node slow = head;
    Node fast = head;
    while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
    }
    return slow.val;

}

// int deleteMiddle(){
//      if (head == null || head.next == null)
//             return null;  // list becomes empty

//         Node slow = head;
//         Node fast = head;
//         Node prev = null;

//         while (fast != null && fast.next != null) {
//             prev = slow;
//             slow = slow.next;
//             fast = fast.next.next;
//         }

//         // 'slow' is now at middle node, 'prev' is before it
//         prev.next = slow.next; // delete middle node

// }
// void display(){
//       System.out.print("Linked List: ");
//         Node temp = head;
//         while (temp != null){
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//         System.out.println();
// }

}
public class FindLeftMiddleOfSLL{
    public static void main(String[] args){
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
        Node g = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;

        // System.out.print(a.val + " ");
        // System.out.print(b.val + " ");
        // System.out.print(c.val + " ");
        // System.out.print(d.val + " ");
        // System.out.print(e.val + " ");

         System.out.print("Linked List: ");
        Node temp = a;
        while (temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
        

        Middle m1 = new Middle(a);
        System.out.println(m1.find());
        // m1.deleteMiddle();
        // m1.display();
    }
}