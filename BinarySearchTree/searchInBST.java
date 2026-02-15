public class searchInBST{
    public static boolean Search(Node root,int val){
        if(root)
    }
    public static void main(String[] args){
         Node a = new Node(10);
        Node b = new Node(5);
        Node c = new Node(15);
        Node d = new Node(2);
        Node e = new Node(8);
        Node f = new Node(12);
        Node g = new Node(19);
        Node h = new Node(13);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        f.left = h;

        Search(a,val);

    }
}