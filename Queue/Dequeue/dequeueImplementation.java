import java.util.*;
class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}

public class dequeueImplementation{

    static class Deque{
    Node front;
    Node rear;
    int size;

    Deque(){
        front = rear = null;
        size = 0;
    }

    boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    void insertFront(int val){
        Node temp = new Node(val);
        if(size == 0){
            //deque is empty
            rear = front = temp;
        }
        else{
            temp.next = front;
            front.prev = temp;
            front = temp;
        }
        size++;
    }
    
    void insertRear(int val){
        Node temp = new Node(val);
        if(rear == null){
            rear = front = temp;
        }
        else{
            temp.prev = rear;
            rear.next = temp;
            rear = temp;
        }
        size++;
    }

    void deleteFront(){
        if(size == 0){
            System.out.println("underFlow");
        }
        else{
            Node temp = front;
            front = front.next;
            
            if(front == null){
                rear = null;
            }
            else{
                front.prev = null;
            }
            size--;
        }
    }

    void deleteRear(){
        if(size == 0){
            System.out.println("UnderFlow");
        }
        else{
            
            Node temp = rear;
            rear = rear.prev;
            if(rear == null){
                front = null;
            }
            else{
                rear.next = null;
            }
            size--;

        }
    }

    int getFront(){
        if(size == 0){
            System.out.println("Underflow");
            return -1;
        }
        return front.val;
    }

    int getRear(){
        if(size == 0){
            System.out.println("underFlow");
            return -1;
        }
        else{
            return rear.val;
        }
    }
    

}
    



 

    public static void main(String[] args){
        Deque dq = new Deque();
        System.out.println("Inserting 5 at rear end");
        dq.insertRear(5);

        System.out.println("Inserting 10 at front end");
        dq.insertFront(10);

        System.out.println("Front element: " + dq.getFront());
        System.out.println("Rear element: " + dq.getRear());

        dq.deleteFront();
        System.out.println("After deleting front, new front: " + dq.getFront());

        dq.deleteRear();
        System.out.println("After deleting rear, new rear: " + dq.getRear());

    }
}

