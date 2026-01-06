
class Node{
    int val;
    Node next; 
    Node(int val){
        this.val=val;
    }
} 
public class ShallowCopyOfNode{
    public static void main(String[] args){
        Node a = new Node(10);    
        System.out.println(a.val);

        //Shallow copy 
        Node temp = a;   //In shallow copy all the control of noad is in the hand of temp if 
                         //we change the value of 'temp' it can reflect on 'a' also.
        System.out.println(temp.val);

        temp.val = 12;
        System.out.println(a.val); // answer is 12


        //Deep copy
        //Node temp = new temp(100);

    }
}