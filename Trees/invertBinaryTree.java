public class invertBinaryTree{
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
       
    } 

    public static void invert(Node root){
        if(root == null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
         System.out.print(root.val + " ");
        invert(root.left);
        invert(root.right);

    }
    public static void main(String[] args){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(9);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        preorder(a);
        System.out.println();
        invert(a);
    }
}